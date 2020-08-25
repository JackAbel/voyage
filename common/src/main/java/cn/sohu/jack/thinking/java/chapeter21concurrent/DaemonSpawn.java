package cn.sohu.jack.thinking.java.chapeter21concurrent;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/8/15 6:01 PM
 */
public class DaemonSpawn implements Runnable {
    public void run() {
        while (true) {
            Thread.yield();
        }
    }
}
