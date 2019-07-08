package cn.sohu.jack.thinking.java.chapter15generics;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/6/21 4:52 PM
 */
public class Generic2<T> {
    T t;
    public T second() {
        return t;
    }

    public <T> void third(Generic1<? super T> w, T t) {
        w.first(t);
    }

    public <T> T co(Generic2<? extends T> g2t) {
        return g2t.second();
    }
}
