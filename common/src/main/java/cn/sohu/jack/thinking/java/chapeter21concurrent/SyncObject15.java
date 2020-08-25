package cn.sohu.jack.thinking.java.chapeter21concurrent;

import java.util.concurrent.TimeUnit;

/**
 * @description:三个方法中的临界区同步同一个对象，同一时间只能运行其中一个方法
 * @author: Xiangbao Jin
 * @since 2019/8/23 3:38 PM
 */
public class SyncObject15 {
    public Object syncObject = new Object();
    public Object syncObject1 = new Object();
    public Object syncObject2 = new Object();

    public void method() {
        synchronized (syncObject) {
            try {
                TimeUnit.MILLISECONDS.sleep(1000);
                System.out.println(System.nanoTime());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("method()");
        }
    }

    public void method2() {
        synchronized (syncObject1) {
            try {
                TimeUnit.MILLISECONDS.sleep(1000);
                System.out.println(System.nanoTime());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("method2()");
        }
    }

    public void method3() {
        synchronized (syncObject2) {
            try {
                TimeUnit.MILLISECONDS.sleep(1000);
                System.out.println(System.nanoTime());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("method3()");
        }
    }
}
