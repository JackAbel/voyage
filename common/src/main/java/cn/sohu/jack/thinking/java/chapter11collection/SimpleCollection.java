package cn.sohu.jack.thinking.java.chapter11collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * @author jinxianbao
 * @date 2019/4/11 12:02 PM
 */
public class SimpleCollection {
    public static void main(String[] args) {
        Collection<Integer> simpleCollection = new ArrayList<>();
        Set<Integer> c = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            // 自动装箱
            ((ArrayList<Integer>) simpleCollection).add(i);
            c.add(i);
        }
        for (Integer i : simpleCollection) {
            System.out.print(i + " ");
        }
    }
}
