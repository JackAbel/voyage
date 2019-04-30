package cn.sohu.jack.thinking.java.chapter12exception;

/**
 * @author jinxianbao
 * @date 2019/4/30 8:40 PM
 */
public class WhoCalled {
    static void f() {
        try {
            throw new Exception();
        } catch (Exception e) {
            for (StackTraceElement ste : e.getStackTrace()) {
                System.out.println(ste.getMethodName());
                System.out.println(ste);
            }
        }
    }

    static void g() {
        f();
    }

    static void h() {
        g();
    }

    public static void main(String[] args) {
        f();
        System.out.println("----------------------");
        g();
        System.out.println("----------------------");
        h();
    }
}
