package cn.sohu.jack.thinking.java.chapeter21concurrent;

/**
 * @description: synchronized the entire method
 * @author: Xiangbao Jin
 * @since 2019/8/23 2:07 PM
 */
public class PairManager1 extends PairManager {
    public synchronized void increment() {
        p.incrementX();
        p.incrementY();
        store(getPair());
    }
}
