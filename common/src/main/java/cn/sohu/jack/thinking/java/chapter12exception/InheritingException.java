package cn.sohu.jack.thinking.java.chapter12exception;

/**
 * @author jinxianbao
 * @date 2019/4/22 11:20 AM
 */
public class InheritingException {
    public void f() throws SimpleException {
        System.out.println("Throw SimpleException from f()");
        throw new SimpleException();
    }

    public static void main(String[] args) {
        InheritingException inheritingException = new InheritingException();
        try {
            inheritingException.f();
        } catch (SimpleException e) {
            e.printStackTrace();
            System.out.println("Catch it!");
        }
    }
}
