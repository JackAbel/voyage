package cn.sohu.jack.thinking.java.chapter17deepcollection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/7/8 2:10 PM
 */
public class CollectionMethods {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("nine");
        c.add("ten");
        c.add("eleven");
        Object[] array = c.toArray();
        String[] str = c.toArray(new String[0]);
        System.out.println("str array: " + Arrays.toString(str));
        // find the max and min elements; this means
        // different things depending on the way
        // the Comparable interface is implemented
        System.out.println("Collections.max(c) " + Collections.max(c));
        System.out.println("Collections.min(c) " + Collections.min(c));
        Collection<String> c2 = new ArrayList<>();
        c2.add("eight");
        c2.add("seven");
        c.addAll(c2);
        c.remove("ten");
        System.out.println("c is " + c);
        c.removeAll(c2);
        System.out.println("c is " + c);
        System.out.println("c.contains(\"nine\")" + c.contains("nine"));
        System.out.println("c.containsAll(c2)" + c.containsAll(c2));
        Collection<String> c3 = new ArrayList<>();
        c3.add("seven");
        c2.retainAll(c3);
        System.out.println("c2 is " + c2);
        c3.clear();
        System.out.println("after clear()" + c3);
    }
}
