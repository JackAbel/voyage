package cn.sohu.jack.thinking.java.chapeter21concurrent;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/8/26 11:00 PM
 */
public class Blocked2 implements Runnable{
    BlockedMutex blockedMutex  = new BlockedMutex();

    public void run() {
        System.out.println("Waiting for f() in BlockedMutex");
        blockedMutex.f();
        System.out.println("Broken out of blocked call");
    }
}
