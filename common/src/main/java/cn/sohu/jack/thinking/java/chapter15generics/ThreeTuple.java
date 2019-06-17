package cn.sohu.jack.thinking.java.chapter15generics;

import cn.sohu.jack.thinking.java.chapter10innerclass.B;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/6/14 6:35 PM
 */
public class ThreeTuple<A, B, C> extends TwoTuple<A, B> {
    public final C third;

    public ThreeTuple(A a, B b, C c) {
        super(a, b);
        third = c;
    }

}
