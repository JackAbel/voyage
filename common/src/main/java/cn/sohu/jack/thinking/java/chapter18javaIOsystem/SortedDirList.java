package cn.sohu.jack.thinking.java.chapter18javaIOsystem;

import java.io.File;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/7/16 9:33 AM
 */
public class SortedDirList {
    private List sl;
    String[] list;
    public SortedDirList(String filePath) {
        File file = new File(filePath);
        list = file.list();
        Arrays.sort(list,String.CASE_INSENSITIVE_ORDER);
        sl = Arrays.asList(list);
    }

    public String[] list() {
        return list;
    }

    public String[] list(String regex) {
        ArrayList<String> s = new ArrayList<>();
        Pattern pattern = Pattern.compile(regex);
        for (String s2 : list) {
            if (pattern.matcher(s2).find()) {
                s.add(s2);
            }
        }
        return (String[])s.toArray();
    }
}
