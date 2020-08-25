package cn.sohu.jack.thinking.java.chapeter21concurrent;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @description: use lock to create critical zone
 * @author: Xiangbao Jin
 * @since 2019/8/23 2:42 PM
 */
public class ExplicitPairManager1 extends PairManager {
    private Lock lock = new ReentrantLock();

    public synchronized void increment() {
        lock.lock();
        try {
            p.incrementX();
            p.incrementY();
            store(getPair());
        } finally {
            lock.unlock();
        }
    }
}
