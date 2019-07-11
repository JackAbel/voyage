package cn.sohu.jack.thinking.java.chapter17deepcollection;

import java.lang.reflect.Array;
import java.util.*;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/7/8 5:12 PM
 */
public class Practice7 {
    public static void main(String[] args) {
        List<String> test1 = new ArrayList<>();
        List<String> test2 = new LinkedList<>();
        List<String> s = Arrays.asList("we have a dream".split(" "));
        List<String> s2 = Arrays.asList("all don't the beautiful".split(" "));
        test1.addAll(s);
        test2.addAll(s2);
        Iterator<String> it = test1.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        ListIterator<String> lit1 = test1.listIterator();
        ListIterator<String> lit2 = test2.listIterator();
        System.out.println(lit1.previousIndex());
        while (lit1.hasNext()) {
            lit1.next();
        }
        while (lit2.hasNext()) {
            lit1.add(lit2.next());
            lit1.previous();
            lit1.previous();
        }
        while (lit1.hasNext()) {
            System.out.println(lit1.next());
        }
        System.out.println(lit1.previousIndex());


    }
}
