package cn.sohu.jack.thinking.java.chapter15generics;

/**
 * @description: we have a dream
 * @author: Xiangbao Jin
 * @since 2019/6/21 11:24 AM
 */
public class Colored<T extends HasColor> {
    T item;

    public Colored(T item) {
        this.item = item;
    }

    java.awt.Color color() {
        return item.getColor();
    }
}
