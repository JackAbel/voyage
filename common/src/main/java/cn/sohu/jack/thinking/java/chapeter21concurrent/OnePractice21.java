package cn.sohu.jack.thinking.java.chapeter21concurrent;

/**
 * @description: exercise 21
 * @author: Xiangbao Jin
 * @since 2019/8/29 10:00 AM
 */
public class OnePractice21 implements Runnable {
    private volatile boolean signal = false;
    public synchronized void run() {
        try {
            while (!signal) {
                System.out.println("A run() wait()");
                wait();
                signal =true;
                System.out.println("A is done waiting");
            }
        } catch (InterruptedException e) {
            System.out.println("wait() is interrupted");
        } finally {
            System.out.println("A run() is leaving!");
        }
    }

    public synchronized void message() {
        System.out.println("we have a success!");
    }

}
