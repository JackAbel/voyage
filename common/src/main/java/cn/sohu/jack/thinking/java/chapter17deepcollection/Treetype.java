package cn.sohu.jack.thinking.java.chapter17deepcollection;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/7/8 6:06 PM
 */
public class Treetype extends HashType implements Comparable<Treetype> {
    public Treetype(int n) {
        super(n);
    }

    public int compareTo(Treetype treetype) {
        return treetype.i < i ? -1 : (treetype.i == i ? 0 : 1);
    }
}
