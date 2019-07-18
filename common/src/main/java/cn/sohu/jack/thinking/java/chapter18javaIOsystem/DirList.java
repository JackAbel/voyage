package cn.sohu.jack.thinking.java.chapter18javaIOsystem;

import java.io.File;
import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/7/15 9:43 PM
 */
public class DirList {
    public static void main(String[] args) {
        File file = new File(".");
        String[] list;
        if (args.length == 0) {
            list = file.list();
        } else {
            list = file.list(new DirFilter(args[0]));
        }
        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
        for (String iterm : list) {
            System.out.println(iterm);
        }
    }
}
