package cn.sohu.jack.thinking.java.chapeter21concurrent;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @description: task wait and notifyAll
 * @author: Xiangbao Jin
 * @since 2019/8/28 10:51 AM
 */
public class CarLock {
    private boolean waxOn = false;
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void Waxed() {
        lock.lock();
        try {
            waxOn = true; // Read to buff
            condition.signalAll();
        } finally {
            lock.unlock();
        }
    }

    public  void buffed() {
        lock.lock();
        try {
            waxOn = false; // Ready for another coat of wax
            condition.signalAll();
        } finally {
            lock.unlock();
        }
    }

    public void waitForWaxing() throws InterruptedException{
        lock.lock();
        try {
            while (!waxOn) {
                condition.await();
            }
        } finally {
            lock.unlock();
        }
    }

    public void waitForBuffed() throws InterruptedException {
        lock.lock();
        try {
            while (waxOn) {
                condition.await();
            }
        } finally {
            lock.unlock();
        }
    }
}
