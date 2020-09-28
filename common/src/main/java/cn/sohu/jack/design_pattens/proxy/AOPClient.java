package cn.sohu.jack.design_pattens.proxy;

import java.lang.reflect.InvocationHandler;
import java.util.logging.Handler;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2020/9/13 5:18 PM
 */
public class AOPClient {
    public static void main(String[] args) {
        // 定义一个主题
        Subject subject = new RealSubject();
        InvocationHandler handler = new MyInvocationHandler(subject);
        DynamicProxy<Subject> subjectDynamicProxy = new DynamicProxy<>();
        Subject proxy = subjectDynamicProxy.newProxyInstance(subject.getClass().getClassLoader(),
                subject.getClass().getInterfaces(), handler);
        proxy.doSomething("Finish");
    }
}
