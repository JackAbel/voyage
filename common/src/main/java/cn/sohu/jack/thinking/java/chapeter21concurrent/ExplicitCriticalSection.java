package cn.sohu.jack.thinking.java.chapeter21concurrent;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/8/23 2:49 PM
 */
public class ExplicitCriticalSection {
    public static void main(String[] args) {
        PairManager pm1 = new ExplicitPairManager1();
        PairManager pm2 = new ExplicitPairManager2();
        CriticalSection.testApproaches(pm1, pm2);
    }
}
