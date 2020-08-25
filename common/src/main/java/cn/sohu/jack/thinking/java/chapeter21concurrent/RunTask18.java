package cn.sohu.jack.thinking.java.chapeter21concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/8/25 12:29 PM
 */
public class RunTask18 implements Runnable {
    public void run() {
        NoTask.useSleep();
    }

    public static void main(String[] args) throws InterruptedException{
        ExecutorService exec = Executors.newCachedThreadPool();
        Future<?> f = exec.submit(new RunTask18());
        TimeUnit.SECONDS.sleep(1);
        f.cancel(true);
        exec.shutdown();
    }
}
