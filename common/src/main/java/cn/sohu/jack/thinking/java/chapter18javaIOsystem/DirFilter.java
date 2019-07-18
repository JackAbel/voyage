package cn.sohu.jack.thinking.java.chapter18javaIOsystem;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/7/15 9:57 PM
 */
public class DirFilter implements FilenameFilter {
    private Pattern pattern;

    public DirFilter(String regex) {
        System.out.println(regex);
        pattern = Pattern.compile(regex);
    }

    public boolean accept(File dir, String name) {
        return pattern.matcher(name).matches();
    }
}
