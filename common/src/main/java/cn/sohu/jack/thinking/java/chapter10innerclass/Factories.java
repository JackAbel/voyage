package cn.sohu.jack.thinking.java.chapter10innerclass;

/**
 * @author jinxianbao
 * @date 2019/3/27 11:29 PM
 */
public class Factories {
    public static void serviceConsumer(ServiceFactory fact) {
        Service s = fact.getService();
        s.method1();
        s.method2();
    }

    public static void main(String[] args) {
        serviceConsumer(Implementation1.factory);
        serviceConsumer(Implementation2.factory);
    }
}
