package cn.sohu.jack.thinking.java.chapeter21concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/8/29 10:04 AM
 */
public class TwoPractice21 implements Runnable {

    private OnePractice21 a;

    public OnePractice21 getA() {
        return a;
    }
    public TwoPractice21(OnePractice21 one) {
        a = one;
    }
    public void run() {
        System.out.println("B run have been started ");
        try {
            TimeUnit.SECONDS.sleep(1);
            synchronized (a) {// method calling notifyAll() must own monitor
                System.out.println("B.run() a.notifyAll()");
                a.notifyAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
        ExecutorService exec = Executors.newCachedThreadPool();
        TwoPractice21 s = new TwoPractice21(new OnePractice21());
        exec.execute(s.getA());
        TimeUnit.MILLISECONDS.sleep(200);
        s.getA().message();
        exec.execute(s);
        TimeUnit.SECONDS.sleep(2);
        exec.shutdownNow();
    }
}
