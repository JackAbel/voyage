package cn.sohu.jack.thinking.java.chapeter21concurrent;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/8/26 10:39 PM
 */
public class MultiLock {
    public synchronized void f1(int count) {
        while (count-- > 0) {
            System.out.println("f1() calling f2() with count " + count);
            f2(count);
        }
    }
    public synchronized void f2(int count) {
        while (count-- > 0) {
            System.out.println("f2() calling f1() with count " + count);
            f1(count);
        }
    }

    public static void main(String[] args) {
        final MultiLock multiLock = new MultiLock();
        new Thread(){
            public void run() {
                multiLock.f1(10);
            }
        }.start();
    }
}
