package cn.sohu.jack.thinking.java.chapeter21concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/8/29 5:40 PM
 */
public class Restaurant {
    public Meal meal;
    public WaitPerson waitPerson = new WaitPerson(this);
    Chef chef = new Chef(this);
    BusyBoy busyBoy = new BusyBoy(this);
    ExecutorService exec = Executors.newCachedThreadPool();

    public Restaurant() {
        exec.execute(chef);
        exec.execute(waitPerson);
        exec.execute(busyBoy);
    }

    public static void main(String[] args) {
        new Restaurant();
    }
}
