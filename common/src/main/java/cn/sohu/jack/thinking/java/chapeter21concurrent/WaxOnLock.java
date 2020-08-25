package cn.sohu.jack.thinking.java.chapeter21concurrent;

import java.util.concurrent.TimeUnit;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/8/28 11:32 AM
 */
public class WaxOnLock implements Runnable {
    private CarLock car;

    public WaxOnLock(CarLock car) {
        this.car = car;
    }

    public void run() {
        try {
            while (!Thread.interrupted()) {
                System.out.println("Wax on! ");
                TimeUnit.MILLISECONDS.sleep(200);
                car.Waxed();
                car.waitForBuffed();
            }
        } catch (InterruptedException e) {
            System.out.println("exist via interrupted");
        }
        System.out.println("Ending Wax on task");
    }

}
