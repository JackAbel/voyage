package cn.sohu.jack.thinking.java.chapter11collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

/**
 * @author jinxianbao
 * @date 2019/4/14 9:18 PM
 */
public class ListIteration {
    public static void main(String[] args) {
        List<String> pets = new ArrayList<>(Arrays.asList("new", "pants", "two", "elephants", "three", "monkeys"));
        ListIterator<String> it = pets.listIterator();
        while (it.hasNext()) {
            System.out.println(it.next() + " " + it.previousIndex() + " " + it.nextIndex());
        }
        System.out.println();
        while (it.hasPrevious()) {
            System.out.println(it.previous() + "m");
        }
        System.out.println(pets);
        it = pets.listIterator(3);
        while (it.hasNext()) {
            it.next();
            it.set("haughty");
        }
        System.out.println(pets);
    }
}
