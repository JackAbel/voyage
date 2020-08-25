package cn.sohu.jack.thinking.java.chapeter21concurrent;

import java.util.concurrent.ThreadFactory;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/8/15 5:18 PM
 */
public class DaemonThreadFactory implements ThreadFactory {
    public Thread newThread(Runnable runnable) {
        Thread t = new Thread(runnable);
        t.setDaemon(true);
        return t;
    }
}
