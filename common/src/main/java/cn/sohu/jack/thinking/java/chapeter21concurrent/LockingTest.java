package cn.sohu.jack.thinking.java.chapeter21concurrent;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/9/27 7:09 PM
 */
public class LockingTest extends Incrementable {
    private Lock lock = new ReentrantLock();

    public void increament() {
        lock.lock();
        try {
            ++counter;
        } finally {
            lock.unlock();
        }
    }
}
