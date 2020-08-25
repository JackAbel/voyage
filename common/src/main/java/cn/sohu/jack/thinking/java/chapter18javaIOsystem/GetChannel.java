package cn.sohu.jack.thinking.java.chapter18javaIOsystem;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/7/29 9:44 PM
 */
public class GetChannel {
    private static final int BSIZE = 1024;

    public static void main(String[] args) {
        // write a file
        try {
            FileChannel fc = new FileOutputStream("data.txt").getChannel();
            fc.write(ByteBuffer.wrap("Some text ".getBytes()));
            fc.close();

            // Add to the end of file
            fc = new RandomAccessFile("data.txt","rw").getChannel();
            fc.position(fc.size());
            fc.write(ByteBuffer.wrap("Some more".getBytes()));
            fc.close();

            // Read the file
            fc = new FileInputStream("data.txt").getChannel();
            ByteBuffer bbf = ByteBuffer.allocate(BSIZE);
            fc.read(bbf);
            bbf.flip();
            while (bbf.hasRemaining()) {
                System.out.println((char)bbf.get());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
