package cn.sohu.jack.thinking.java.chapeter21concurrent;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/8/29 5:02 PM
 */
public class NotifyVsNotifyAll {
    public static void main(String[] args) throws Exception {
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            exec.execute(new Task());
        }
        exec.execute(new Task2());
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            boolean prod = true;
            @Override
            public void run() {
                if (prod) {
                    System.out.print("\n notify() ");
                    Task.blocker.prod();
                    prod = false;
                } else {
                    System.out.print("\n notifyAll() ");
                    Task.blocker.prodAll();
                    prod = true;
                }
            }
        },400, 400);

        TimeUnit.SECONDS.sleep(5);
        timer.cancel();
        System.out.println("\n Timer canceled ");
        TimeUnit.MILLISECONDS.sleep(500);
        System.out.println("\n Task2.blocker.prodAll() ");
        Task2.blocker.prodAll();
        TimeUnit.MILLISECONDS.sleep(500);
        System.out.println("\n Shutting down");
        exec.shutdownNow(); // Interrupt all tasks
    }
}
