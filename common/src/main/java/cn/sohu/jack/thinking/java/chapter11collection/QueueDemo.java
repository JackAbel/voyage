package cn.sohu.jack.thinking.java.chapter11collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**
 * @author jinxianbao
 * @date 2019/4/19 10:23 AM
 */
public class QueueDemo {
    private static void printQ(Queue queue) {
        while (queue.peek() != null) {
            System.out.print(queue.remove()+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue<Integer> queues = new LinkedList<>();
        Random rand = new Random(47);
        for (int i = 0; i < 10; i++) {
            queues.offer(rand.nextInt(i + 10));
        }
        printQ(queues);
        Queue<Character> qc = new LinkedList<>();
        for (char c : "sgUGcsgkjeglag".toCharArray()) {
            qc.offer(c);
        }
        printQ(qc);
    }
}
