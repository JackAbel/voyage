package cn.sohu.jack.thinking.java.chapter15generics;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/6/21 6:05 PM
 */
public class FixedSizeStack<T> {
    private int index = 0;
    public Object[] storage;
    public FixedSizeStack(int size) {
        this.storage = new Object[size];
    }

    public void push(T item) {
        storage[index++] = item;
    }
    @SuppressWarnings("unchecked")
    public T pop() {
        return (T)storage[--index];

    }
}
