package cn.sohu.jack.thinking.java.chapeter21concurrent;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/8/29 6:19 PM
 */
public class BusyBoy implements Runnable {
    private Restaurant restaurant;

    public BusyBoy(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public void run() {
        try {
            while (!Thread.interrupted()) {
                synchronized (this) {
                    if (restaurant.meal == null) {
                        wait();
                    }
                }
                System.out.println("\n busy boy clean rubbish");
            }
        } catch (InterruptedException e) {
            System.out.println("BusyBoy interrupted! ");
        }
    }
}
