package cn.sohu.jack.thinking.java.chapter18javaIOsystem;

import java.io.*;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/7/27 2:47 PM
 */
public class BasicFileOutPut {
    static String file = "/Users/xiangbao/Documents/JavaProjects/voyage/common/src/main/java/cn/sohu/jack/thinking/java/chapter18javaIOsystem/BasicFileOutPut.out";

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(BufferedInputFile.read("/Users/xiangbao/Documents/JavaProjects/voyage/common/src/main/java/cn/sohu/jack/thinking/java/chapter18javaIOsystem/BasicFileOutPut.java")));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file)));
        int lineCount;
        String s;
        while ((s = in.readLine()) != null) {
            out.println(s);
        }
        out.close();
        // show the  stored file
        System.out.println(BufferedInputFile.read(file));
    }
}
