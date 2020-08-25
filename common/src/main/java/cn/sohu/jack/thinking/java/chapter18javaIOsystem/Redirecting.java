package cn.sohu.jack.thinking.java.chapter18javaIOsystem;

import java.io.*;

/**
 * @description: java输出重定向
 * @author: Xiangbao Jin
 * @since 2019/7/27 4:19 PM
 */
public class Redirecting {
    public static void main(String[] args) throws IOException {
        PrintStream p = System.out;
        BufferedInputStream bf = new BufferedInputStream(new FileInputStream("Redirecting.java"));
        PrintStream or = new PrintStream(new BufferedOutputStream(new FileOutputStream("test.out")));
        System.setIn(bf);
        System.setOut(or);
        System.setErr(or);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s = br.readLine()) != null) {
            System.out.println(s);
        }
        or.close();
        System.setOut(p);
    }
}
