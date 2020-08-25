package cn.sohu.jack.thinking.java.chapeter21concurrent;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/9/27 7:06 PM
 */
public class SynchronizingTest extends Incrementable {
    public synchronized void increament() {
        ++counter;
    }
}
