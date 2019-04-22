package cn.sohu.jack.thinking.java.chapter11collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * @author jinxianbao
 * @date 2019/4/15 9:37 PM
 */
public class Practice14 {
    static LinkedList<Integer> li = new LinkedList<>();
    static int[] sugar = {1, 2, 3, 4, 5};
    static ListIterator<Integer> lit = li.listIterator();

    public static void main(String[] args) {
        for (Integer i : sugar) {
            lit.add(i);
            lit.previous();
        }
        System.out.println(li);
    }
}
