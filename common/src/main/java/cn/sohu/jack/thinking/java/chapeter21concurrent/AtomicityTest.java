package cn.sohu.jack.thinking.java.chapeter21concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/8/21 6:12 PM
 */
public class AtomicityTest implements Runnable {
    private int i = 0;

    public synchronized int getValue() {
        return i;
    }

    private synchronized void evenIncremment() {
        i++;
        i++;
    }

    public void run() {
        while (true) {
            evenIncremment();
        }
    }

    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        AtomicityTest at = new AtomicityTest();
        exec.execute(at);
        while (true) {
            int val = at.getValue();
            if (val % 2 != 0) {
                System.out.println(val);
                System.exit(0   );
            }
        }
    }
}
