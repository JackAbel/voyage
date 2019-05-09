package cn.sohu.jack.thinking.java.chapter12exception;

/**
 * @author jinxianbao
 * @date 2019/5/7 9:27 AM
 */
public class AlwaysFinally {
    public static void main(String[] args) {
        System.out.println("Entering 1st try block");
        try {
            System.out.println("Entering 2nd try block");
            try {
                throw new FourException("live");
            } finally {
                System.out.println("finally in 2nd try block");
            }
        } catch (FourException e) {
            System.out.println("Caught FourException in 1st try block!");
        } finally {
            System.out.println("finally in 1st try block");
        }
    }
}
