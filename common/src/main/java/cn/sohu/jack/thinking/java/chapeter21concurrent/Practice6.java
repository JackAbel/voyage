package cn.sohu.jack.thinking.java.chapeter21concurrent;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/8/4 11:06 PM
 */
public class Practice6 implements Runnable{
    Random rand = new Random(47);

    public void run() {
        System.out.println("I feel sad!");
        try {
            int i = rand.nextInt(18);
            TimeUnit.SECONDS.sleep(i);
            System.out.println("the task sleep time is " + i);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            exec.execute(new Practice6());
        }
        exec.shutdown();
    }
}
