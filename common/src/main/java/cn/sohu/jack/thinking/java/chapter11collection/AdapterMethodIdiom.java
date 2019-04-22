package cn.sohu.jack.thinking.java.chapter11collection;

import java.util.Arrays;

/**
 * @author jinxianbao
 * @date 2019/4/22 9:27 AM
 */
public class AdapterMethodIdiom {
    public static void main(String[] args) {
        ReversibleArrayList<String> r = new ReversibleArrayList<>(Arrays.asList("we have a good future".split(" ")));
        for (String s : r) {
            System.out.print(s + " ");
        }
        System.out.println();
        for (String s : r.reversed()) {
            System.out.print(s + " ");
        }
    }
}
