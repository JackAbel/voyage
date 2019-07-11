package cn.sohu.jack.thinking.java.chapter17deepcollection;

import java.util.*;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/7/8 4:11 PM
 */
public class Lists {
    private static boolean b;
    private static String s;
    private static int i;
    private static Iterator<String> it;
    private static ListIterator<String> lit;

    public static void basicTest(List<String> a) {
        a.add(1, "x"); //add at location 1
        a.add("x");
        Collection<String> c = new ArrayList<>();
        c.add("one");
        // add a collection:
        a.addAll(c);
        // add a collection starting at location 3
        a.addAll(3,c);
        b = a.contains("1");
        b = a.containsAll(c);
        // Lists allow random access, which is cheap for ArrayList, expensive for LinkedList
        s = a.get(1);
        i = a.indexOf("1");
        b = a.isEmpty();
        it = a.iterator();
        lit = a.listIterator();
        lit = a.listIterator(3);
        i = a.lastIndexOf("1");
        a.remove(1);
        a.remove("3");
        a.set(1, "y");
    }

    public static void iterMotion(List<String> a) {
        ListIterator<String> it = a.listIterator();
        b = it.hasNext();
        b = it.hasPrevious();
        s = it.next();
        i = it.nextIndex();
        s = it.previous();
        i = it.previousIndex();
        System.out.println("--");
    }

    public static void iterManipulation(List<String> a) {
        ListIterator<String> it = a.listIterator();
        it.add("47");
        it.next();
        it.remove();
        it.next();
        it.set("47");
    }
}
