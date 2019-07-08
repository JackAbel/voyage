package cn.sohu.jack.thinking.java.chapter15generics;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/6/21 8:01 PM
 */
public class C extends SelfBounded<C> {
    C setAndGet(C arg) {
        set(arg);
        return getElement();
    }
}
