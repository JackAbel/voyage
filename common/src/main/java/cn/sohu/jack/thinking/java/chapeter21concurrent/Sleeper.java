package cn.sohu.jack.thinking.java.chapeter21concurrent;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/8/15 8:34 PM
 */
public class Sleeper extends Thread {
    private int duration;

    public Sleeper(String name, int sleepTime) {
        super(name);
        duration = sleepTime;
        start();
    }

    public void run() {
        try {
            sleep(duration);
        } catch (InterruptedException e) {
            System.out.println(getName() + " was interrupted.isInterrupted = " + isInterrupted());
        }
        System.out.println(getName() + " has awakened! ");
    }
}
