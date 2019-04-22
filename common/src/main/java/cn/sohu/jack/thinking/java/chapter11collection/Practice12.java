package cn.sohu.jack.thinking.java.chapter11collection;

import java.util.*;

/**
 * @author jinxianbao
 * @date 2019/4/14 9:31 PM
 */
public class Practice12 {

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(10, 20, 30, 40));
        ListIterator<Integer> ll = list1.listIterator();
        int y = list1.size()-1;
        int[] i = new int[list1.size()];
        while (ll.hasNext()) {


            i[y] = ll.next();
            y--;
        }

        for (Integer s : i) {
            list2.add(s);
        }
        System.out.println(list2);
        LinkedList<Integer> s = new LinkedList<>(Arrays.asList(1,2));
        s.addFirst(3);
        System.out.println(s);
        System.out.println(s.peek());
        s.removeLast();
        System.out.println(s);
    }
}
