package cn.sohu.jack.thinking.java.chapter14TypeInformation;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/6/14 2:42 PM
 */
public class RealObject implements Interface {
    public void doSomething() {
        System.out.println("Do something");
    }

    public void somethingElse(String arg) {
        System.out.println("something else " + arg);
    }
}
