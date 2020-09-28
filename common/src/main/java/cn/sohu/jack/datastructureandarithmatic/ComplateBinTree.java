package cn.sohu.jack.datastructureandarithmatic;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2020/9/26 10:07 PM
 */
public interface ComplateBinTree extends BinTree {
    public BinTreePosition addLast(Object e);
    public Object delLast();
    public BinTreePosition posOfNode(int i);

}
