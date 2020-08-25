package cn.sohu.jack.thinking.java.chapter18javaIOsystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/7/27 3:01 PM
 */
public class FileOutputShortcut {
    static String file = "/Users/xiangbao/Documents/JavaProjects/voyage/common/src/main/java/cn/sohu/jack/thinking/java/chapter18javaIOsystem/FileOutputShortcut.out";

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(BufferedInputFile
                .read("/Users/xiangbao/Documents/JavaProjects/voyage/common/src/main/java/cn/sohu/jack/thinking/java/chapter18javaIOsystem/FileOutputShortcut.java")));
        PrintWriter out = new PrintWriter(file);
        int lineCount = 1;
        String s;
        while ((s = in.readLine()) != null) {
            out.println(s);
        }
        out.close();

    }
}
