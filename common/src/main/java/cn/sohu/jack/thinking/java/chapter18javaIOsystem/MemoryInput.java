package cn.sohu.jack.thinking.java.chapter18javaIOsystem;

import java.io.IOException;
import java.io.StringReader;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/7/26 10:13 PM
 */
public class MemoryInput {
    public static void main(String[] args) throws IOException {
        StringReader sr = new StringReader(BufferedInputFile.read("live.sh"));
        while (sr.read() != -1) {
            System.out.println((char)sr.read());
        }
    }
}
