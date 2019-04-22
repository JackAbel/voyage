package cn.sohu.jack.thinking.java.chapter11collection;

import java.util.*;

/**
 * @author jinxianbao
 * @date 2019/4/19 10:23 AM
 */
public class PriorityQueueDemo {
    private static void printQ(Queue queue) {
        while (queue.peek() != null) {
            System.out.print(queue.remove()+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        PriorityQueue<Integer> queues = new PriorityQueue<>();
        Random rand = new Random(47);
        for (int i = 0; i < 10; i++) {
            queues.offer(rand.nextInt(i + 10));
        }
        printQ(queues);
        PriorityQueue<Character> qc = new PriorityQueue<>();
        for (char c : "sgUGcsgkjeglag".toCharArray()) {
            qc.offer(c);
        }
        printQ(qc);
        List<String> strings = new ArrayList<>(Arrays.asList("EDUCATION SHOULD ESCHEW OBFUSCATION".split("")));
        PriorityQueue<String> pqs = new PriorityQueue<>(strings.size(), Collections.reverseOrder());
        PriorityQueue<String> pqs2 = new PriorityQueue<>(strings.size());
        pqs.addAll(strings);
        pqs2.addAll(strings);
        printQ(pqs);
        printQ(pqs2);
    }
}
