package cn.sohu.jack.thinking.java.chapter14TypeInformation;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/6/14 3:01 PM
 */
public class DynamicProxyHandler implements InvocationHandler {
    public Object proxied;

    public DynamicProxyHandler(Object proxied) {
        this.proxied = proxied;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("**** proxy" + proxy.getClass() + ".method: " + method + "Object.args: " + args);
        System.out.println(proxy.getClass().getDeclaredFields());
        if (args != null) {
            for (Object arg : args) {
                System.out.println(arg);
            }
        }
        return method.invoke(proxied,args);
    }
}
