package cn.sohu.jack.thinking.java.chapter18javaIOsystem;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/7/30 10:03 PM
 */
public class LockingMappedFiles {
    static final int LENGTH = 0x8FFFFFF; // 128M
    static FileChannel fc;

    private static class LockAndModify extends Thread {
        private ByteBuffer bbf;
        private int start, end;

        LockAndModify(ByteBuffer bbf, int start, int end) {
            this.start = start;
            this.end = end;
            bbf.limit(end);
            bbf.position(start);
            this.bbf = bbf.slice();
            start();
        }

        public void run() {
            // Exclusive lock with no overlap;
            try {
                FileLock fl = fc.tryLock(start,end,false);
                System.out.println("Locked: " + start + " to " + end);
                while (bbf.position() < bbf.limit() - 1) {
                    bbf.put((byte)(bbf.get()+1));
                }

                fl.release();
                System.out.println("release: " + start + " to " + end);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws Exception {
        fc = new RandomAccessFile("file.dat", "rw").getChannel();
        MappedByteBuffer out = fc.map(FileChannel.MapMode.READ_WRITE, 0, LENGTH);
        for (int i = 0; i < LENGTH; i++) {
            out.put((byte)'x');
        }
        new LockAndModify(out, 0, LENGTH/3);
        new LockAndModify(out, LENGTH/2,  LENGTH/2 + LENGTH/4);
    }
}
