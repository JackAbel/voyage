package cn.sohu.jack.thinking.java.chapter18javaIOsystem;

import java.io.File;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/7/16 10:14 AM
 */
public class Practice3 {
    public static long getFileSize(File file) {
        if (file.exists() && file.isFile()) {
            return file.length();
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        File file = new File(".");
        Long l = 0L;
        String[] list = file.list();
        for (String s : list) {
            File tmp = new File(s);
            l += getFileSize(tmp);
        }
        System.out.println(l);
    }
}
