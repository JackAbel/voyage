package cn.sohu.jack.thinking.java.chapter15generics;

import cn.sohu.jack.thinking.java.chapter14TypeInformation.A;
import cn.sohu.jack.thinking.java.chapter14TypeInformation.HiddenC;

import java.lang.reflect.Method;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/6/14 5:19 PM
 */
public class HiddenImplementation {
    public static void main(String[] args) throws Exception {
        A a = HiddenC.makeA();
        a.f();

        callHiddenMethod(a, "g");
        callHiddenMethod(a, "u");
        callHiddenMethod(a, "v");
        callHiddenMethod(a, "w");
    }

    static void callHiddenMethod(Object o, String methodName) throws Exception{
        Method g = o.getClass().getDeclaredMethod(methodName);
        g.setAccessible(true);
        g.invoke(o);
    }
}
