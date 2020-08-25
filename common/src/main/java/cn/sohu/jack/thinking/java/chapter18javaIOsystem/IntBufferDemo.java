package cn.sohu.jack.thinking.java.chapter18javaIOsystem;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/7/30 2:39 PM
 */
public class IntBufferDemo {
    private static final int BSIZE = 1024;

    public static void main(String[] args) {
        ByteBuffer bb = ByteBuffer.allocate(BSIZE);
        IntBuffer ib = bb.asIntBuffer();
        ib.put(new int[]{11, 42, 97, 109, 811, 1016});
        System.out.println(ib.get(3));
        ib.put(3, 1811);
        ib.flip();
        while (ib.hasRemaining()) {
            System.out.println(ib.get());
        }
    }
}
