package cn.sohu.jack.thinking.java.chapeter21concurrent;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/8/23 2:47 PM
 */
public class ExplicitPairManager2 extends PairManager {
    private Lock lock = new ReentrantLock();

    public synchronized void increment() {
        Pair temp;
        lock.lock();
        try {
            p.incrementX();
            p.incrementY();
            temp = getPair();
        } finally {
            lock.unlock();
        }
        store(getPair());
    }
}
