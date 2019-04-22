package cn.sohu.jack.thinking.java.chapter11collection;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author jinxianbao
 * @date 2019/4/15 9:04 PM
 */
public class LinkedListFeatures {
    public static void main(String[] args) {
        LinkedList<String> linkedListExample = new LinkedList<>(Arrays.asList("uncle", "seven", "cousin", "aunt"));
        System.out.println(linkedListExample);
        System.out.println("linkedListExample.getFirst()" + linkedListExample.getFirst());
        System.out.println("linkedListExample.element()" + linkedListExample.element());
        // Only differs in empty-list behavior, peek() will return null
        System.out.println("linkedListExample.peek()" + linkedListExample.peek());
        // remove first element and return removed element
        System.out.println("linkedListExample.remove()" + linkedListExample.remove());
        System.out.println("linkedListExample.removeFirst()" + linkedListExample.removeFirst());
        // Only differs in empty-list behavior
        System.out.println("linkedListExample.poll()" + linkedListExample.poll());
        System.out.println(linkedListExample);
        linkedListExample.addFirst("sister-in-law");
        System.out.println(linkedListExample);
        linkedListExample.addLast("lower-in-law");
        System.out.println(linkedListExample);
    }
}
