package cn.sohu.jack.thinking.java.chapeter21concurrent;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/8/26 10:52 PM
 */
public class BlockedMutex {
    private Lock lock = new ReentrantLock();

    public BlockedMutex() {
        // Acquire it right away, to demonstrate interruption of a task blocked on a ReentrantLock
        lock.lock();
    }

    public void f() {
        // This will never be available to a second task
        try {
            lock.lockInterruptibly(); //special call
            System.out.println("lock acquired in f()");
        } catch (InterruptedException e) {
            System.out.println("Interrupted from lock acquisition in f()");
        }
    }
}
