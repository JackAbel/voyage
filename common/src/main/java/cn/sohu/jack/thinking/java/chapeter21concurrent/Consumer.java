package cn.sohu.jack.thinking.java.chapeter21concurrent;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/8/29 7:52 PM
 */
public class Consumer implements Runnable {
    int consumed = 0;
    Market24 market;
    List<Item> cart = new ArrayList<>();

    Consumer(Market24 market) {
        this.market = market;
    }

    public void run() {
        try {
            while (!Thread.interrupted()) {
                // Cannot consume more Items than produced
                synchronized (this) {
                    while (!(cart.size() < market.producer.getCount())) {
                        wait();
                    }
                }
                // Move Item from items to cart
                if (cart.add(market.items.poll())) {
                    System.out.println("Consuming Item " + ++consumed);
                    synchronized (market.producer) {
                        market.producer.notifyAll();
                    }
                }
            }
        } catch (InterruptedException e) {
            System.out.println("consumer interrupted at " + consumed );
        }
    }
}
