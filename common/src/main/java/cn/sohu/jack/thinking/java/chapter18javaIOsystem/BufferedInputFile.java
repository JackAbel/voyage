package cn.sohu.jack.thinking.java.chapter18javaIOsystem;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/7/26 9:28 PM
 */
public class BufferedInputFile {
    public static String read(String fileName) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(fileName));
        String s;
        StringBuilder sb = new StringBuilder();
        while ((s = in.readLine()) != null) {
            sb.append(s);
        }
        in.close();
        return sb.toString();
    }
}
