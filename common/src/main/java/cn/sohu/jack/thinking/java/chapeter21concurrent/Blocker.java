package cn.sohu.jack.thinking.java.chapeter21concurrent;

/**
 * @description: 事实上 当notifyAll()因某个特定锁被调用时，只有等待这个锁的任务才会被唤醒
 * @author: Xiangbao Jin
 * @since 2019/8/29 4:45 PM
 */
public class Blocker {
    synchronized void waitingCall() {
        try {
            while (!Thread.interrupted()) {
                wait();
                System.out.println(Thread.currentThread() + " ");
            }
        } catch (InterruptedException e) {
            //e.printStackTrace();
        }
    }

    synchronized void prod() {
        notify();
    }

    synchronized void prodAll() {
        notifyAll();
    }
}
