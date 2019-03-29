package cn.sohu.jack.thinking.java.chapter9interface;

/**
 * @author jinxianbao
 * @date 2019/3/28 10:39 PM
 */
public class MultiImplementation {
    static void takeD(D d) {
    }
    static void takeE(E e) {
    }

    public static void main(String[] args) {
        Z z = new Z();
        takeD(z);
        takeE(z.makeE());
    }
}
