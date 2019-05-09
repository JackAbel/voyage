package cn.sohu.jack.thinking.java.chapter12exception;

/**
 * @author jinxianbao
 * @date 2019/5/5 11:12 AM
 */
public class Practice10 {
    static void g() throws MyException {
        System.out.println("method g()");
        throw new MyException();
    }

    static void f() {

        try {
            g();
            throw new MyException2("we",10);
        } catch (MyException e) {
            throw new RuntimeException();
        } catch (MyException2 exception2) {
            exception2.getMessage();
        }
    }
}
