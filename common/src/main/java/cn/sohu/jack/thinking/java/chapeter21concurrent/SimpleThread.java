package cn.sohu.jack.thinking.java.chapeter21concurrent;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/8/15 7:22 PM
 */
public class SimpleThread {
    private int countDown = 5;
    private static int threadCount = 0;
    public  Thread getThread() {
        return new Thread(){
            public void run() {
                while (true) {
                    System.out.println(this);
                    if (--countDown == 0) {
                        return;
                    }
                }
            }
        };
    }

    public static void main(String[] args) {
        SimpleThread simpleThread = new SimpleThread();
        for (int i = 0; i < 5; i++) {
            simpleThread.getThread();
        }
    }
}
