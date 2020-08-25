package cn.sohu.jack.thinking.java.chapeter21concurrent;

import java.util.concurrent.TimeUnit;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/8/28 11:41 AM
 */
public class WaxOffLock implements Runnable {
    private CarLock car;

    public WaxOffLock(CarLock car) {
        this.car = car;
    }

    public void run() {
        try {
            while (!Thread.interrupted()) {
                car.waitForWaxing();
                System.out.println("Wax Off! ");
                TimeUnit.MILLISECONDS.sleep(200);
                car.buffed();
            }
        } catch (InterruptedException e) {
            System.out.println("exist via interrupt");
        }
        System.out.println("ending Wax Off task");
    }
}
