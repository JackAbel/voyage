package cn.sohu.jack.thinking.java.chapter10innerclass;

/**
 * @author jinxianbao
 * @date 2019/4/6 6:37 PM
 */
public class MyIncrement {
    public void increment() {
        System.out.println("Other operation!");
    }

    static void f(MyIncrement mi) {
        mi.increment();
    }
}
