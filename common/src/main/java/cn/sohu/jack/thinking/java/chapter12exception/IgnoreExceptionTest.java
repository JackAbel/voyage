package cn.sohu.jack.thinking.java.chapter12exception;

/**
 * @author jinxianbao
 * @date 2019/5/13 9:47 PM
 */
public class IgnoreExceptionTest {
    static void divisionZero(int a) throws ArithmeticException {
        int s = 12 / a;
        System.out.println(s);
    }

    public static void main(String[] args) {
        divisionZero(0);
    }
}
