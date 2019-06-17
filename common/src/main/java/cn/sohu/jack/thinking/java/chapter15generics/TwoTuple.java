package cn.sohu.jack.thinking.java.chapter15generics;

/**
 * @description: tuple implement any length containers
 * @author: Xiangbao Jin
 * @since 2019/6/14 6:29 PM
 */
public class TwoTuple<A, B> {
    public final A first;
    public final B second;

    public TwoTuple(A a, B b) {
        this.first = a;
        this.second = b;
    }

    public String toString() {
        return "(" + first + " " + second + ")";
    }
}
