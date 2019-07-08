package cn.sohu.jack.thinking.java.chapter15generics;

import cn.sohu.jack.thinking.java.chapter14TypeInformation.Factory;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/6/18 5:42 PM
 */
public class Foo2<T> {
    private T x;

    public <F extends FactoryI<T>> Foo2(F factory) {
        x = factory.create();
    }
}
