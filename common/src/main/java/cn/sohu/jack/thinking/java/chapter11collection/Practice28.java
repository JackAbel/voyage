package cn.sohu.jack.thinking.java.chapter11collection;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

/**
 * @author jinxianbao
 * @date 2019/4/19 11:19 AM
 */
public class Practice28 {
    private static PriorityQueue<Double> doubleQueues = new PriorityQueue<>();

    private static void offerQueue(int y) {
        Random rand = new Random(47);
        for (int i = 0; i < y; i++) {
            double d = rand.nextDouble();
            doubleQueues.offer(d);
        }
    }

    private static void queuePoll() {
        while (doubleQueues.peek() != null) {
            System.out.println(doubleQueues.poll());
        }
    }

    public static void main(String[] args) {
        offerQueue(10);
        queuePoll();
    }
}
