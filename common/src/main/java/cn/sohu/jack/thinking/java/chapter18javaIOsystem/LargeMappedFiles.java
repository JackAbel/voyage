package cn.sohu.jack.thinking.java.chapter18javaIOsystem;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/7/30 3:37 PM
 */
public class LargeMappedFiles {
    static int length = 0x8FFFFFF; // 128M

    public static void main(String[] args) throws IOException {
        MappedByteBuffer out = new RandomAccessFile("test.dat", "rw").getChannel().map(FileChannel.MapMode.READ_WRITE
        , 0 , length);
        for (int i = 0; i < length; i++) {
            out.put((byte)'X');
        }
        System.out.println("Finishing Writing");
        for (int i = length / 2; i < length / 2 + 6; i++) {
            System.out.println((char)out.get(i));
        }
    }
}
