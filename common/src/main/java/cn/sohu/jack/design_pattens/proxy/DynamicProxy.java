package cn.sohu.jack.design_pattens.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import static com.sun.xml.internal.ws.dump.LoggingDumpTube.Position.Before;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2020/9/13 5:07 PM
 */
public class DynamicProxy<T>  {
    public T newProxyInstance(ClassLoader classLoader, Class[] interfaces, InvocationHandler handler) {
        // 寻找JoinPoint连接点，AOP框架使用元数据定义
        if (true) {
            // 执行一个前置通知
            (new BeforeAdvice()).exec();
        }
        return (T)Proxy.newProxyInstance(classLoader,interfaces, handler);
    }
}
