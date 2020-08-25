package cn.sohu.jack.thinking.java.chapeter21concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @description: 在回收旧线程时停止创建新线程
 * @author: Xiangbao Jin
 * @since 2019/8/4 8:30 PM
 */
public class CachedThreadPoolPractice20 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            //executorService.execute(new LiftOff());
            Future<?> f = executorService.submit(new LiftOff());
            f.cancel(true);
        }
        executorService.shutdownNow();
    }
}
