package cn.sohu.jack.test;

import sun.misc.PerformanceLogger;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2020/9/10 5:37 PM
 */
public class MyInvocationHandler implements InvocationHandler {
    private Object target;

    public MyInvocationHandler(Object target) {
        super();
        this.target = target;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("-------begin-------" + method.getName());
        Object result = method.invoke(proxy, args);
        System.out.println("-------end-------" + method.getName());
        return result;
    }

    public Object getProxy() {
        return Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), target.getClass().getInterfaces(), this);
    }


}
