package cn.sohu.jack.thinking.java.chapter15generics;

/**
 * @description: 边界是先class后接口
 * @author: Xiangbao Jin
 * @since 2019/6/21 11:30 AM
 */
public class ColoredDimension<T extends Dimension & HasColor> {
    T item;

    public ColoredDimension(T item) {
        this.item = item;
    }

    java.awt.Color color() {
        return item.getColor();
    }

    public int getX() {
        return item.x;
    }

    public int getY() {
        return item.y;
    }

    public int getZ() {
        return item.z;
    }
}
