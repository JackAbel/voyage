package cn.sohu.jack.thinking.java.chapter18javaIOsystem;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/7/30 9:47 AM
 */
public class BufferToText {
    private static final int BSIZE = 1024;

    public static void main(String[] args) throws IOException {
        FileChannel out = new FileOutputStream("data2.txt").getChannel();
        out.write(ByteBuffer.wrap("Some text".getBytes()));
        out.close();
        FileChannel in = new FileInputStream("data2.txt").getChannel();
        ByteBuffer buff = ByteBuffer.allocate(BSIZE);
        in.read(buff);
        buff.flip();
        // Doesn't work
        System.out.println(buff.asCharBuffer());
        // decode using this system's default charset
        buff.rewind();
        String encoding = System.getProperty("file.encoding");
        System.out.println("Decoded using " + encoding + ": " + Charset.forName(encoding).decode(buff));
        out = new FileOutputStream("data2.txt").getChannel();
        out.write(ByteBuffer.wrap("some text".getBytes("UTF-16BE")));
        out.close();
        // now try reading again;
        in = new FileInputStream("data2.txt").getChannel();
        buff.clear();
        in.read(buff);
        buff.flip();
        System.out.println(buff.asCharBuffer());
        // use a CharBuffer to write a file
        out = new FileOutputStream("data2.txt").getChannel();
        buff = ByteBuffer.allocate(24);
        buff.asCharBuffer().put("some text");
        out.write(buff);
        out.close();
        in = new FileInputStream("data2.txt").getChannel();
        buff.clear();
        in.read(buff);
        buff.flip();
        System.out.println(buff.asCharBuffer());
    }
}
