package cn.sohu.jack.thinking.java.chapter14TypeInformation;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @description: 动态代理类只能代理接口（不支持抽象类），代理类都需要实现InvocationHandler类，实现invoke方法。
 *              该invoke方法就是调用被代理接口的所有方法时需要调用的，该invoke方法返回的值是被代理接口的一个实现类
 * @author: Xiangbao Jin
 * @since 2019/6/14 4:04 PM
 */
public class LogHander implements InvocationHandler {
    // target object
    private Object targetObject;

    // 绑定关系，也就是关联到哪个接口（与具体的实现类绑定）的哪些方法被调用时，执行invoke方法

    /**
     * 该方法用于指定类装载器，一组接口以及调用处理器生成动态代理类实例
     * 第一个参数指定代理类的类加载器，需要将其指定为和目标对象同一个的加载器
     * 第二个参数要拿到代理对象的实现接口
     * 第三个参数表明这些被拦截的方法在被拦截时需要执行哪个InvocationHandler的invoke方法
     * @param targetObject
     * @return
     */
    public Object newProxyInstance(Object targetObject) {
        this.targetObject = targetObject;

        return Proxy.newProxyInstance(targetObject.getClass().getClassLoader(), targetObject.getClass().getInterfaces(),this);
    }

    /**
     * 关联的这个实现类的方法被调用时将被执行
     * @param proxy 代理
     * @param method 实现类要实现的方法
     * @param args 方法需要的参数
     * @return
     * @throws Throwable
     */
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("start ----->");
        for (Object arg : args) {
            System.out.println(arg);
        }
        Object ret = null;
        // 调用目标方法
        ret = method.invoke(targetObject, args);
        return ret;
    }
}
