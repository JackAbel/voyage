package cn.sohu.jack.thinking.java.chapter17deepcollection;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/7/8 5:53 PM
 */
public class SetType {
    int i;

    public SetType(int n) {
        this.i = n;
    }

    public boolean equals(Object o) {
        return o instanceof SetType && (i == ((SetType) o).i);
    }

    public String toString() {
        return Integer.toString(i);
    }
}
