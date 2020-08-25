package cn.sohu.jack.thinking.java.chapter18javaIOsystem;

import java.nio.ByteBuffer;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/7/30 2:11 PM
 */
public class GetData {
    private static final int BSIZE = 1024;

    public static void main(String[] args) {
        ByteBuffer bbf = ByteBuffer.allocate(BSIZE);
        int i = 0;
        while (i++ < bbf.limit()) {
            if (bbf.get() != 0) {
                System.out.print("nozero");
            }
        }
        System.out.println("i = " + i);
        bbf.rewind();
        // Store and read a char array
        bbf.asCharBuffer().put("Howdy");
        char c;
        while ((c = bbf.getChar()) != 0) {
            System.out.print(c + " ");
        }
        System.out.println();
        bbf.rewind();
        // Store and read a short
        bbf.asShortBuffer().put((short)471142);
        System.out.println(bbf.getShort());
        bbf.rewind();
        // Store and read a short
        bbf.asIntBuffer().put(99471142);
        System.out.println(bbf.getInt());
        bbf.rewind();
        // Store and read a short
        bbf.asLongBuffer().put(99471142);
        System.out.println(bbf.getLong());
        bbf.rewind();
        // Store and read a short
        bbf.asFloatBuffer().put(99471142);
        System.out.println(bbf.getFloat());
        bbf.rewind();
        // Store and read a short
        bbf.asDoubleBuffer().put(99471142);
        System.out.println(bbf.getDouble());

    }
}
