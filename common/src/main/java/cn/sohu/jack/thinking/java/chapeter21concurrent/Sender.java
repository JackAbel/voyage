package cn.sohu.jack.thinking.java.chapeter21concurrent;

import java.io.IOException;
import java.io.PipedWriter;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/9/27 6:08 PM
 */
public class Sender implements Runnable {
    private Random rand = new Random(47);

    private PipedWriter out = new PipedWriter();

    public PipedWriter getOut() {
        return out;
    }

    public void run() {
        try {
            while (true) {
                for (char c = 'A'; c < 'Z'; c++) {
                    out.write(c);
                    TimeUnit.MICROSECONDS.sleep(500);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
