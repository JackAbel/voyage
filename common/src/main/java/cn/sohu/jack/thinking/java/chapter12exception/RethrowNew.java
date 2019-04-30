package cn.sohu.jack.thinking.java.chapter12exception;

/**
 * @author jinxianbao
 * @date 2019/4/30 9:20 PM
 */
public class RethrowNew {
    public static void f() throws OneException {
        System.out.println("originating the exception in f()");
        throw new OneException("thrown from f()");
    }

    public static void main(String[] args) {
        try {
            f();
        } catch (OneException e) {
            System.out.println("Caught in inner try, e.printStackTrace");
            e.printStackTrace(System.out);
            throw new TwoException("from inner try");
        }
        try {
            h();
        } catch (Exception e) {
            System.out.println("main: printStackTrace");
            e.printStackTrace(System.out);
        }
    }
}
