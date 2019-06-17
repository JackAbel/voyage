package cn.sohu.jack.thinking.java.chapter14TypeInformation;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/6/14 2:46 PM
 */
public class SimpleProxy implements Interface {
    private Interface proxied;

    public SimpleProxy(Interface proxied) {
        this.proxied = proxied;
    }

    public void doSomething() {
        System.out.println("SimpleProxy do something");
        proxied.doSomething();
    }

    public void somethingElse(String arg) {
        System.out.println("SimpleProxy something else " + arg);
        proxied.somethingElse(arg);
    }
}
