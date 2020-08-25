package cn.sohu.jack.thinking.java.chapeter21concurrent;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/8/15 5:47 PM
 */
public class DaemonThreadPoolExecutor extends ThreadPoolExecutor {
    public DaemonThreadPoolExecutor() {
        super(0, Integer.MAX_VALUE,60L, TimeUnit.SECONDS,
                new SynchronousQueue<Runnable>(), new DaemonThreadFactory());
    }
}
