package cn.sohu.jack.thinking.java.chapter18javaIOsystem;

import java.io.File;
import java.io.FilenameFilter;
import java.lang.reflect.Array;
import java.util.regex.Pattern;

/**
 * @description: 参数内部类
 * @author: Xiangbao Jin
 * @since 2019/7/16 9:22 AM
 */
public class DirList3 {
    public static void main(String[] args) {
        File file = new File(".");
        String[] list;
        list = file.list(new FilenameFilter() {
            private Pattern pattern = Pattern.compile(args[0]);
            @Override
            public boolean accept(File dir, String name) {
                return pattern.matcher(name).matches();
            }
        });
    }
}
