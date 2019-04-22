package cn.sohu.jack.thinking.java.chapter11collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @author jinxianbao
 * @date 2019/4/14 8:29 PM
 */
public class SimpleIteration {
    public static void main(String[] args) {
        List<String> pets = new ArrayList<String>(Arrays.asList("new", "pants", "two", "elephants", "three", "monkeys"));
        Iterator<String> it = pets.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.print(s + " ");
        }
        System.out.println();
        it = pets.iterator();
        for (int i = 0; i < 3; i++) {
            it.next();
            it.remove();
        }
        System.out.println(pets);
    }
}
