package cn.sohu.jack.thinking.java.chapter9interface;

/**
 * @author jinxianbao
 * @date 2019/3/19 9:59 PM
 */
public class Factories {
    public static void serviceConsumer(ServiceFactory serviceFactory) {
        Service s = serviceFactory.getService();
        s.method1();
        s.method2();
    }

    public static void main(String[] args) {
        serviceConsumer(new Implementation1Factory());
        serviceConsumer(new Implementation2Factory());
    }
}
