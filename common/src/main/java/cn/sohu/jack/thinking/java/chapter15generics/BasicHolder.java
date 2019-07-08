package cn.sohu.jack.thinking.java.chapter15generics;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/6/21 7:42 PM
 */
public class BasicHolder<T> {
    T element;

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    void f() {
        System.out.println(element.getClass().getSimpleName());
    }
}
