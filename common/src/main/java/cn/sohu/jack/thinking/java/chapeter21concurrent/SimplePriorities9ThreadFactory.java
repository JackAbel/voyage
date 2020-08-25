package cn.sohu.jack.thinking.java.chapeter21concurrent;

import java.util.Random;
import java.util.concurrent.ThreadFactory;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/8/15 6:30 PM
 */
public class SimplePriorities9ThreadFactory implements ThreadFactory {
    Random rand = new Random(47);

    public Thread newThread(Runnable runnable) {
        Thread t = new Thread(runnable);
        int i = rand.nextInt(3);
        switch (i) {
            case 0 : t.setPriority(Thread.MIN_PRIORITY);
            case 1 : t.setPriority(Thread.NORM_PRIORITY);
            case 2 : t.setPriority(Thread.MAX_PRIORITY);
            default:
        }
        return t;
    }
}
