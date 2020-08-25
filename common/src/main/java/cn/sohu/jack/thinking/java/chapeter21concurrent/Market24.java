package cn.sohu.jack.thinking.java.chapeter21concurrent;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/8/29 7:53 PM
 */
public class Market24 {
    ExecutorService exec = Executors.newCachedThreadPool();
    Queue<Item> items = new LinkedList<>();
    Producer producer = new Producer(this);
    Consumer consumer = new Consumer(this);

    Market24() {
        exec.execute(producer);
        exec.execute(consumer);
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (producer.getCount() == 100 && consumer.consumed == 100) {
            exec.shutdownNow();
        }
    }
    public static void main(String[] args) {
        new Market24();
    }
}
