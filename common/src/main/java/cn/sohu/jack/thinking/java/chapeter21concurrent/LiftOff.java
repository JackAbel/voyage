package cn.sohu.jack.thinking.java.chapeter21concurrent;

/**
 * @description: definite task
 * @author: Xiangbao Jin
 * @since 2019/8/4 5:41 PM
 */
public class LiftOff implements Runnable {
    protected int countDown=10;
    private static int taskCount = 0;
    private final int id = taskCount++;

    public LiftOff() { }

    public LiftOff(int countDown) {
        this.countDown = countDown;
    }

    public String status() {
        return "#" + id + "(" + (countDown > 0 ? countDown : "LiftOff!") + ").";
    }

    public void run() {
        while (countDown-- > 0) {
            System.out.print(status());
            Thread.yield();
        }
    }
}
