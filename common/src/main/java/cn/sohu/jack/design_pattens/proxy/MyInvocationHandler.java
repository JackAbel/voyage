package cn.sohu.jack.design_pattens.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2020/9/13 5:00 PM
 */
public class MyInvocationHandler implements InvocationHandler {
    private Object obj = null;

    public MyInvocationHandler(Object _obj) {
        this.obj = _obj;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(this.obj, args);
    }
}
