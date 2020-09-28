package cn.sohu.jack.design_pattens.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2020/9/13 4:31 PM
 */
public class GamePlayerIH implements InvocationHandler {
    //被代理者
    Class c = null;
    //被代理的对象
    Object obj = null;

    public GamePlayerIH(Object _obj) {
        this.obj = _obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(this.obj, args);
        return result;
    }
}
