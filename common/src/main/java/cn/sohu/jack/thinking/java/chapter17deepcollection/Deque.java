package cn.sohu.jack.thinking.java.chapter17deepcollection;

import java.util.LinkedList;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/7/15 7:12 PM
 */
public class Deque<T> {
    private LinkedList<T> deque = new LinkedList<>();
    public void addFirst(T e) {
        deque.addFirst(e);
    }

    public void addLast(T e) {
        deque.addLast(e);
    }

    public T getFirst() {
        return deque.getFirst();
    }

    public T getLast() {
        return deque.getLast();
    }


}
