package cn.sohu.jack.thinking.java.chapeter21concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/8/23 2:23 PM
 */
public class CriticalSection {
    // Test the two different approaches;
    static void testApproaches(PairManager pman1, PairManager pman2) {
        ExecutorService exec = Executors.newCachedThreadPool();
        PairManipulator pm1 = new PairManipulator(pman1);
        PairManipulator pm2 = new PairManipulator(pman2);

        PairChecker pc1 = new PairChecker(pman1);
        PairChecker pc2 = new PairChecker(pman2);

        exec.execute(pm1);
        exec.execute(pm2);
        exec.execute(pc1);
        exec.execute(pc2);

        try {
            TimeUnit.MILLISECONDS.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("pm1: " + pm1 + "\npm2: " + pm2);
        System.exit(0);
    }

    public static void main(String[] args) {
        PairManager pm1 = new PairManager1();
        PairManager pm2 = new PairManager2();
        testApproaches(pm1, pm2);
    }
}
