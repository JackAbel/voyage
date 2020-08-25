package cn.sohu.jack.thinking.java.chapter18javaIOsystem;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/7/27 3:27 PM
 */
public class TextFile extends ArrayList<String> {
    public static String read(String filename) {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader in = new BufferedReader(new FileReader(new File(filename).getAbsoluteFile()));
            try {
                String s;
                while ((s = in.readLine()) != null) {
                    sb.append(s);
                    sb.append("\n");
                }
            } finally {
                in.close();

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    public static void write(String filename, String text) {
        try {
            PrintWriter out = new PrintWriter(new File(filename).getAbsoluteFile());
            try {
                out.println(text);
            } finally {
                out.close();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public TextFile(String filename, String splitter) {
        super(Arrays.asList(read(filename).split(splitter)));
        if (get(0).equals("")) {
            remove(0);
        }
    }

    public TextFile(String filename) {
        this(filename, "\n");
    }

    public void write(String filename) {
        try {
            PrintWriter out = new PrintWriter(new File(filename).getAbsoluteFile());
            try {
                for (String item : this) {
                    out.println(item);
                }
            } finally {
                out.close();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String file = read(
                "/Users/xiangbao/Documents/JavaProjects/voyage/common/src/main/java/cn/sohu/jack/thinking/java/chapter18javaIOsystem/TextFile.java");
        write("/Users/xiangbao/Documents/JavaProjects/voyage/common/src/main/java/cn/sohu/jack/thinking/java/chapter18javaIOsystem/test",
                file);
        TextFile text = new TextFile("test.txt");
        text.write("test2.txt");

    }
}
