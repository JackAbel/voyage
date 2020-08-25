package cn.sohu.jack.thinking.java.chapeter21concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @description: 忙等待的示例
 * @author: Xiangbao Jin
 * @since 2019/8/29 3:31 PM
 */
public class TwoPractice22 implements Runnable {
    private BusyWait b;

    public TwoPractice22(BusyWait b) {
        this.b = b;
    }

    public void run() {
        long startTime = System.currentTimeMillis();
        try {
            while (true) {
                if (b.isSign()) {
                    b.setSign(false);
                    System.out.println("set b sign to false");
                    System.out.println("wait time " + (System.currentTimeMillis()- startTime));
                    break;
                } else {
                    TimeUnit.MILLISECONDS.sleep(5);
                }
            }
        } catch (InterruptedException e) {
            System.out.println("exit by Interrupt!");
        }
    }

    public static void main(String[] args) throws Exception {
        BusyWait busyWait = new BusyWait();
        ExecutorService exec = Executors.newCachedThreadPool();
        exec.execute(new TwoPractice22(busyWait));
        exec.execute(new OnePractice22(busyWait));
        TimeUnit.MILLISECONDS.sleep(2000);
        exec.shutdownNow();
    }
}
