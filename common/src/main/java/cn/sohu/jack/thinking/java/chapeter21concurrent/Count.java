package cn.sohu.jack.thinking.java.chapeter21concurrent;

import java.util.Random;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/8/23 7:53 PM
 */
public class Count {
    private int count = 0;
    private Random rand = new Random(47);

    public synchronized int increment() {
        int temp = count;
        if (rand.nextBoolean()) {
            Thread.yield();
        }
        return (count = ++temp);
    }

    public synchronized int value() {
        return count;
    }
}
