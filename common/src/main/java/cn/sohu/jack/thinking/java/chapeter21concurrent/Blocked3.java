package cn.sohu.jack.thinking.java.chapeter21concurrent;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.concurrent.TimeUnit;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/8/28 9:29 AM
 */
public class Blocked3 implements Runnable {
    private volatile double d = 0.0;

    public void run() {
        try {
            while (!Thread.interrupted()) {
                // point1
                NeedsCleanup n1 = new NeedsCleanup(1);
                // start try-finally immediately after definition

                try {
                    System.out.println("sleeping");
                    TimeUnit.SECONDS.sleep(1);
                    // point2
                    NeedsCleanup n2 = new NeedsCleanup(2);
                    // guarantee proper cleanup of n2:
                    try {
                        System.out.println("Calculating");
                        // A time-consuming non-blocking operation
                        for (int i = 1; i < 2500000; i++) {
                            d = d + (Math.PI + Math.E) /d;
                        }
                        System.out.println("Finished time-consuming operation");
                    } finally {
                        n2.cleanup();
                    }
                } finally {
                    n1.cleanup();
                }
            }
            System.out.println("Exiting via while() test");
        } catch (InterruptedException e) {
            System.out.println("Exiting via InterruptedException");
        }
    }
}
