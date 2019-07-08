package cn.sohu.jack.thinking.java.chapter15generics;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/6/21 4:48 PM
 */
public class Generic1<T> {
    T t;

    public Generic1(T t) {
        this.t = t;
    }
    public void first(T s) {
        System.out.println("the param of first method is " + s);
    }
}
