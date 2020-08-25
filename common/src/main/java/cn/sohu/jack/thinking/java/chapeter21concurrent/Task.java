package cn.sohu.jack.thinking.java.chapeter21concurrent;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/8/29 4:50 PM
 */
public class Task implements Runnable {
    static Blocker blocker = new Blocker();

    public void run() {
        blocker.waitingCall();
    }
}
