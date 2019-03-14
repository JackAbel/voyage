package cn.sohu.jack.thinking.java.chapter8polymorphism;

/**
 * @author jinxianbao
 * @date 2019/3/14 10:22 AM
 */
public class FieldAccess {
    public static void main(String[] args) {
        Super sup = new Sub();
        System.out.println("sup.field = " + sup.field + "  sup.getField = " + sup.getField());
        Sub sub = new Sub();
        System.out.println("sub.field = " + sub.field + "  sub.getField = " + sub.getField() + "   sub.getSuperField = " +
                sub.getSuperField());
    }
}
