package cn.sohu.jack.thinking.java.chapter18javaIOsystem;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/7/27 1:54 PM
 */
public class FormattedMemoryInput {
    public static void main(String[] args) {
        try {
            DataInputStream dis = new DataInputStream(new ByteArrayInputStream(BufferedInputFile
                    .read("FormattedMemoryInput.java").getBytes()));
            /*while (true) {
                System.out.print((char)dis.readByte());
            }*/
            while (dis.available() != 0) {
                System.out.println((char)dis.readByte());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
