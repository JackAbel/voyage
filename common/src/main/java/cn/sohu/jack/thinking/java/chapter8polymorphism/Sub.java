package cn.sohu.jack.thinking.java.chapter8polymorphism;

/**
 * @author jinxianbao
 * @date 2019/3/14 10:20 AM
 */
public class Sub extends Super {
    public int field = 1;

    public int getField() {
        return field;
    }

    public int getSuperField() {
        return super.field;
    }
}
