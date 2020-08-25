package cn.sohu.jack.thinking.java.chapeter21concurrent;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/8/29 4:50 PM
 */
public class Task2 implements Runnable {
    // a separate Blocker object
    static Blocker blocker = new Blocker();

    public void run() {
        blocker.waitingCall();
    }
}
