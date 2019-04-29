package cn.sohu.jack.thinking.java.chapter12exception;

/**
 * @author jinxianbao
 * @date 2019/4/23 10:01 AM
 */
public class ExtraFeatures {
    public static void f() throws MyException2 {
        System.out.println("Throwing MyException2 from f()");
        throw new MyException2();
    }

    public static void g() throws MyException2 {
        System.out.println("Throwing MyException2 from g()");
        throw new MyException2("Originated in g()");
    }

    public static void h() throws MyException2 {
        System.out.println("Throwing MyException2 from h()");
        throw new MyException2("Throwing MyException2 from h()", 47);
    }

    public static void main(String[] args) {
        try {
            f();
        } catch (MyException2 myException2) {
            myException2.printStackTrace(System.out);
        }

        try {
            g();
        } catch (MyException2 myException2) {
            myException2.printStackTrace(System.out);
        }

        try {
            h();
        } catch (MyException2 myException2) {
            myException2.printStackTrace(System.out);
        }
    }
}
