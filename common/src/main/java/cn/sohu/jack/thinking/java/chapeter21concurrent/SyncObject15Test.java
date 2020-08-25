package cn.sohu.jack.thinking.java.chapeter21concurrent;

import java.util.concurrent.TimeUnit;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/8/23 3:45 PM
 */
public class SyncObject15Test {
    public static void main(String[] args) {
        final SyncObject15 sync15 = new SyncObject15();
        Thread thread = new Thread(){
            public void run() {
                sync15.method();
            }
        };
        Thread thread1 = new Thread(){
            public void run() {
                sync15.method2();
            }
        };
        Thread thread2 = new Thread(){
            public void run() {
                sync15.method3();
            }
        };
        thread.start();
        thread2.start();
        thread1.start();
    }
}
