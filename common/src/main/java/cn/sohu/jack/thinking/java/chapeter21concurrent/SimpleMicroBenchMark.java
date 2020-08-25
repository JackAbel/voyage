package cn.sohu.jack.thinking.java.chapeter21concurrent;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/9/27 7:11 PM
 */
public class SimpleMicroBenchMark {
    static long test(Incrementable incr) {
        long start = System.nanoTime();
        for (long i = 0; i < 10000000L; i++) {
            incr.increament();
        }
        return System.nanoTime() - start;
    }

    public static void main(String[] args) {
        long synchTime = test(new SynchronizingTest());
        long lockTime = test(new LockingTest());
        System.out.println("synchronized time = " + synchTime);
        System.out.println("lock time = " + lockTime);
    }
}
