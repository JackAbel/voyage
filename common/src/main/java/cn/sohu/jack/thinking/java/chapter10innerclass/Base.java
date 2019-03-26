package cn.sohu.jack.thinking.java.chapter10innerclass;

/**
 * @author jinxianbao
 * @date 2019/3/25 10:17 PM
 */
public abstract class Base {
    public Base(int i) {
        System.out.println("Base constructor.i = " + i);
    }

    public abstract void f();
}
