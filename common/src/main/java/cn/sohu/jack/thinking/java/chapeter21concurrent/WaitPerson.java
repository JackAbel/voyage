package cn.sohu.jack.thinking.java.chapeter21concurrent;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/8/29 5:39 PM
 */
public class WaitPerson implements Runnable {
    private Restaurant restaurant;

    public WaitPerson(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public void run() {
        try {
            while (!Thread.interrupted()) {
                synchronized (this) {
                    while (restaurant.meal == null) {
                        wait();
                    }
                }
                System.out.println("WaitPerson got " + restaurant.meal);
                synchronized (restaurant.busyBoy) {
                    restaurant.busyBoy.notifyAll();
                }

                synchronized (restaurant.chef) {
                    restaurant.meal = null;
                    restaurant.chef.notifyAll(); // ready for another meal
                }
            }
        } catch (InterruptedException e) {
            System.out.println("Waitperson interrupted");
        }
    }
}
