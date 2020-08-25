package cn.sohu.jack.thinking.java.chapeter21concurrent;

/**
 * @description: 线程锁实现的阻塞
 * @author: Xiangbao Jin
 * @since 2019/8/25 11:40 AM
 */
public class SynchronizedBlocked implements Runnable {
    public synchronized void f() {
        while (true) { // never release lock
            Thread.yield();
        }
    }

    public SynchronizedBlocked() {
        new Thread(){
            public void run() {
                f(); // lock acquired by this thread
            }
        }.start();
    }

    public void run() {
        System.out.println("try to call f()");
        f();
        System.out.println("Exiting SynchronizedBlocked.run()");
    }
}
