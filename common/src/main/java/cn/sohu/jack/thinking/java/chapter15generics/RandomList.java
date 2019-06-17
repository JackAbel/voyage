package cn.sohu.jack.thinking.java.chapter15generics;

import java.util.ArrayList;
import java.util.Random;

/**
 * @description: exercise six
 * @author: Xiangbao Jin
 * @since 2019/6/14 8:40 PM
 */
public class RandomList<T> {
    private ArrayList<T> storage = new ArrayList<>();
    private Random rand = new Random(47);

    public void add(T item) {
        storage.add(item);
    }

    public T select() {
        return storage.get(rand.nextInt(storage.size()));
    }


}
