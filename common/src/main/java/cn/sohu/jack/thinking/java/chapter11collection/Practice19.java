package cn.sohu.jack.thinking.java.chapter11collection;

import java.util.*;

/**
 * @author jinxianbao
 * @date 2019/4/16 11:36 AM
 */
public class Practice19 {
    public static void main(String[] args) {
        Set<String> randSet = new HashSet<>();
        Set<String> LinkRandSet = new LinkedHashSet<>();
        randSet.add("da");
        randSet.add("bc");
        randSet.add("cd");
        randSet.add("de");
        List<String> ls = new ArrayList<>();
        for (String s : randSet) {
               ls.add(s);
            System.out.print(s + " ");
        }
        ls.sort(null);
        LinkRandSet.addAll(ls);

        System.out.println(LinkRandSet);
    }
}
