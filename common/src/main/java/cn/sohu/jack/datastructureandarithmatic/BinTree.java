package cn.sohu.jack.datastructureandarithmatic;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2020/9/18 8:35 PM
 */
public interface BinTree {
    BinTreePosition getRoot();
    boolean isEmpty();
    int getSize();
    // 获得树的高度
    int getHight();

    Iterator preOrderIterator();
    Iterator inOrderIterator();
    Iterator postOrderIterator();
}
