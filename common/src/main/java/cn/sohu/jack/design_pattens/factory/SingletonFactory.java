package cn.sohu.jack.design_pattens.factory;

import java.lang.reflect.Constructor;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2020/9/13 8:48 AM
 */
public class SingletonFactory {
    private static Singleton singleton;
    static {
        try {
            Class c = Class.forName(Singleton.class.getName());
            Constructor constructor = c.getDeclaredConstructor();
            constructor.setAccessible(true);
            singleton = (Singleton) constructor.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Singleton getSingleton() {
        return singleton;
    }
}
