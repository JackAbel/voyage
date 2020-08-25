package cn.sohu.jack.thinking.java.chapeter21concurrent;

import java.util.concurrent.TimeUnit;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/8/28 9:49 AM
 */
public class InterruptingIdiom {
    public static void main(String[] args) throws Exception {
        Thread t = new Thread(new Blocked3());
        t.start();
        TimeUnit.MILLISECONDS.sleep(1005);
        t.interrupt();
    }
}
