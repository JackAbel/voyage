package cn.sohu.jack.datastructureandarithmatic;

/**
 * @description: 二叉树实现类
 * @author: Xiangbao Jin
 * @since 2020/9/25 10:57 AM
 */
public interface BinTreePosition extends Position {
    // 判断是否有父亲
    boolean hasParent();
    // 返回当前节点的父节点
    BinTreePosition getParent();
    // 设置当前节点为父节点
    void setParent(BinTreePosition b);
    // 判断是否为叶子
    boolean isLeaf();
    // 判断是否为左孩子
    boolean isLChild();
    // 判断是否有左孩子
    boolean hasLChild();
    // 设置当前节点的左孩子（当前节点b的右孩子和父节点不一定为空）
    void setLChild(BinTreePosition b);
    BinTreePosition getLChild();
    // 判断是否为右孩子
    boolean isRChild();
    // 判断是否有右孩子
    boolean hasRChild();
    void setRChild(BinTreePosition b);
    BinTreePosition getRChild();
    // 返回当前节点的后代元素的数目
    int getSize();
    // 更新当前节点的范围及其祖先的范围
    void updateSize();

    // 返回当前节点的高度
    int getHeight();
    void updateHeight();

    int getDepth();
    // 在父亲发生变化后，当前节点及其后代节点的深度更新
    void updateDepth();
    BinTreePosition secede();
    // 按照中序遍历的顺序，返回当前节点的直接前驱
    BinTreePosition getPre();
    // 按照中序遍历的顺序，返回当前节点的直接后继
    BinTreePosition getSucc();

    BinTreePosition attachL(BinTreePosition c);
    BinTreePosition attachR(BinTreePosition c);

    Iterator ElementsPreOrder();
    Iterator ElementsInOrderElements();
    Iterator ElementsPostOrderElements();






}
