package cn.sohu.jack.thinking.java.chapter14TypeInformation;

import java.lang.reflect.Proxy;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/6/14 3:09 PM
 */
public class SimpleDynamicProxy {
    public static void consumer(Interface iface) {
        iface.doSomething();
        iface.somethingElse("bonobo");
    }

    public static void main(String[] args) {
        RealObject realObject = new RealObject();
        consumer(realObject);
        // Insert a proxy and call again
        Interface proxy = (Interface)Proxy.newProxyInstance(Interface.class.getClassLoader(),
                new Class[]{Interface.class}, new DynamicProxyHandler(realObject));
        consumer(proxy);
    }
}
