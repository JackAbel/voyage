package cn.sohu.jack.thinking.java.chapeter21concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/8/5 10:00 AM
 */
public class SimplePriorities9 implements Runnable {
    protected int countDown = 5;
    private volatile double d; // no optimization

    public String toString() {
        return Thread.currentThread() + " : " + countDown;
    }

    public void run() {
        while (true) {
            // An expensive, interruptable operation
            for (int i = 0; i < 100000; i++) {
                d += (Math.PI + Math.E) / (double)i;
                if (i % 1000 == 0) {
                    Thread.yield();
                }
            }
            System.out.println(this);
            if (--countDown == 0) {
                return;
            }
        }
    }

    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool(new SimplePriorities9ThreadFactory());
        for (int i = 0; i < 5; i++) {
            exec.execute(new SimplePriorities9());
        }
        exec.execute(new SimplePriorities9());
        exec.shutdown();
    }
}
