package cn.sohu.jack.thinking.java.chapter18javaIOsystem;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/7/16 9:11 AM
 */
public class DirList2 {
    public static FilenameFilter filter(final String regex) {
        return new FilenameFilter() {
            private Pattern pattern = Pattern.compile(regex);
            @Override
            public boolean accept(File dir, String name) {
                return pattern.matcher(name).matches();
            }
        };
    }
}
