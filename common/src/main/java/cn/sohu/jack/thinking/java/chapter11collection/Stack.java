package cn.sohu.jack.thinking.java.chapter11collection;

import java.util.LinkedList;

/**
 * @author jinxianbao
 * @date 2019/4/16 9:23 AM
 */
public class Stack<T> {
    // genericity
    LinkedList<T> storage = new LinkedList<T>();
    public void push(T v) {
        storage.addFirst(v);
    }

    public T peek() {
        return storage.getFirst();
    }

    public T pop() {
        return storage.removeFirst();
    }

    public boolean empty() {
        return storage.isEmpty();
    }

    public String toString() {
        return storage.toString();
    }
}
