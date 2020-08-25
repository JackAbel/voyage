package cn.sohu.jack.thinking.java.chapeter21concurrent;

/**
 * @description: definite task
 * @author: Xiangbao Jin
 * @since 2019/8/4 5:41 PM
 */
public class LiftOffPractice01 implements Runnable {
    protected int countDown=3;
    private static int taskCount = 0;
    private final int id = taskCount++;
    private String startMessage;
    private String endMessage;

    public LiftOffPractice01(String startMessage, String endMessage) {
        this.startMessage = startMessage;
        this.endMessage = endMessage;
        System.out.println(startMessage);
    }

    public LiftOffPractice01(int countDown) {
        this.countDown = countDown;
    }

    public String status() {
        return "#" + id + "(" + (countDown > 0 ? countDown : "LiftOff!") + ").";
    }

    public void run() {
        while (countDown-- > 0) {
            System.out.println(status());
            Thread.yield();
        }

        System.out.println(endMessage);
    }
}
