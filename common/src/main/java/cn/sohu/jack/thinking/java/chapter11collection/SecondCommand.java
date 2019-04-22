package cn.sohu.jack.thinking.java.chapter11collection;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author jinxianbao
 * @date 2019/4/19 10:41 AM
 */
public class SecondCommand {
    private static Queue<Command> queue = new LinkedList<>();
    public static Command writeCommondToQueue(Command c) {
        queue.offer(c);
        return c;
    }

    private static void removeQueue(Queue<Command> queue) {
        while (queue.peek() != null) {
            Command c = queue.remove();
            c.operation();
        }
    }

    public static void main(String[] args) {
        String[] test = {"future", "comfortable", "cousin"};
        for (String s : test) {
            Command c = new Command(s);
            writeCommondToQueue(c);
        }
        removeQueue(queue);
    }

}
