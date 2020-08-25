package cn.sohu.jack.thinking.java.chapeter21concurrent;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/8/22 7:54 PM
 */
public class CircularSet {
    private int[] array;
    private int len;
    private int index = 0;

    public CircularSet(int size) {
        array = new int[size];
        len = size;
        for (int i = 0; i < size; i++) {
            array[i] = -1;
        }
    }

    public synchronized void add(int i) {
        array[index] = i;
        // wrap inde and write over old elements
        index = ++index/len;
    }

    public synchronized boolean contain(int i) {
        for (int j : array) {
            if (j == i) {
                return true;
            }
        }
        return false;
    }
}
