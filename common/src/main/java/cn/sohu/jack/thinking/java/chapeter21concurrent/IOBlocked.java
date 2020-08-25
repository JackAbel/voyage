package cn.sohu.jack.thinking.java.chapeter21concurrent;

import java.io.IOException;
import java.io.InputStream;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/8/25 11:34 AM
 */
public class IOBlocked implements Runnable {
    private InputStream in;

    public IOBlocked(InputStream is) {
        in = is;
    }

    public void run() {
        try {
            System.out.println("wait for read!");
            in.read();
        } catch (IOException e) {
            if (Thread.currentThread().isInterrupted()) {
                System.out.println("Interrupted from blocked I/O");
            } else {
                throw new RuntimeException(e);
            }
        }
        System.out.println("exiting IOBlocked.run() ");
    }
}
