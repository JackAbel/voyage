package cn.sohu.jack.thinking.java.chapter10innerclass;

/**
 * @author jinxianbao
 * @date 2019/3/25 10:21 PM
 */
public class AnonymousConstructor {
    public static Base getBase(int i) {
        return new Base(i) {
            @Override
            public void f() {
                System.out.println("In Anonymous f()");
            }
        };
    }

    public static void main(String[] args) {
        Base base = getBase(47);
        base.f();
    }
}
