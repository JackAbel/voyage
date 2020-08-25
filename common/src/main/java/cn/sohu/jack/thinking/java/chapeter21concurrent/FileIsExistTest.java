package cn.sohu.jack.thinking.java.chapeter21concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/8/23 5:56 PM
 */
public class FileIsExistTest implements Runnable {
    public void run() {
        while (true) {
            if (FileIsExist.getExist()) {
                System.out.println(Thread.currentThread().getName());
                try {
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println("file not exist");
                break;
            }
        }
    }
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        exec.execute(new CheckFileThread());
        for (int i=0; i < 5; i++) {
            exec.execute(new FileIsExistTest());
        }
    }
}
