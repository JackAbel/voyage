package cn.sohu.jack.thinking.java.chapeter21concurrent;

import java.util.concurrent.TimeUnit;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/8/26 11:02 PM
 */
public class Interrupting2 {
    public static void main(String[] args) throws Exception {
        Thread t = new Thread(new Blocked2());
        t.start();
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Issuing in t.interrupt()");
        t.interrupt();
    }
}
