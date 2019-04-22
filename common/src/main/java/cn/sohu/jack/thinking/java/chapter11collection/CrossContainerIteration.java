package cn.sohu.jack.thinking.java.chapter11collection;

import cn.sohu.jack.thinking.java.chapter9interface.E;

import java.util.*;

/**
 * @author jinxianbao
 * @date 2019/4/14 8:51 PM
 */
public class CrossContainerIteration {
    public static void display(Iterator<String> iterator) {
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }

    public static void displayToString(Collection c) {
        for (Iterator i = c.iterator(); i.hasNext(); ) {
            System.out.println(i.next().toString());
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<String> pets = new ArrayList<>(Arrays.asList("new", "pants", "two", "elephants", "three", "monkeys"));
        LinkedList<String> llPets = new LinkedList<String>(pets);
        HashSet<String> hashSetPets = new HashSet<>(pets);
        TreeSet<String> treeSetPets = new TreeSet<>(pets);
        display(pets.iterator());
        display(llPets.iterator());
        display(hashSetPets.iterator());
        display(treeSetPets.iterator());
        displayToString(pets);
    }
}
