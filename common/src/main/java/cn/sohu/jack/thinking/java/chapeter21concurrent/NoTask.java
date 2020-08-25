package cn.sohu.jack.thinking.java.chapeter21concurrent;

import java.util.concurrent.TimeUnit;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/8/25 12:26 PM
 */
public class NoTask {
    public static void useSleep() {
        System.out.println("start use sleep()");
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            if (Thread.currentThread().isInterrupted()) {
                System.out.println("NoTask is interrupted!");
            } else {
                throw new RuntimeException(e);
            }
        }
        System.out.println("end use sleep()");
    }
}
