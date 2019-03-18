package cn.sohu.jack.thinking.java.chapter8polymorphism;

/**
 * @author jinxianbao
 * @date 2019/3/15 10:06 AM
 */
public class RTTI {
    public static void main(String[] args) {
        Useful[] x = {new Useful(), new MoreUseful()};
        x[0].f();
        x[1].g();
        // compile time: method not be found in Useful
        //x[1].u();
        ((MoreUseful)x[1]).u(); // downcast
        ((MoreUseful)x[0]).u(); // Exception throw
    }
}
