package cn.sohu.jack.thinking.java.chapeter21concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/8/28 11:47 AM
 */
public class WaxOMaticLock {
    public static void main(String[] args) throws Exception {
        CarLock car = new CarLock();
        ExecutorService exec = Executors.newCachedThreadPool();
        exec.execute(new WaxOnLock(car));
        exec.execute(new WaxOffLock(car));

        TimeUnit.SECONDS.sleep(5);
        exec.shutdownNow();
    }
}
