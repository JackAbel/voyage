package cn.sohu.jack.thinking.java.chapeter21concurrent;

import java.util.concurrent.TimeUnit;

/**
 * @description: 忙等待的示例
 * @author: Xiangbao Jin
 * @since 2019/8/29 3:31 PM
 */
public class OnePractice22 implements Runnable {
    private BusyWait b;

    public OnePractice22(BusyWait b) {
        this.b = b;
    }

    public void run() {
        try {
            TimeUnit.SECONDS.sleep(1);
            b.setSign(true);
        } catch (InterruptedException e) {
            System.out.println("exit by Interrupt!");
        }
    }
}
