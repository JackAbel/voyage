package cn.sohu.jack.datastructureandarithmatic;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2020/9/17 10:31 PM
 */

/**
 * 树相关定理和概念
 * 定义1、父亲 儿子 兄弟 根节点 边 深度 高度 祖先 后代 子树
 *     2、任一节点的孩子数目，称为度
 *     3、至少拥有一个孩子的节点称为内部节点Internal node，没有任何孩子的节点称为外部节点External node或者叶子leaf
 *     4、由树中首尾相接的而构成的序列称作树中长度为k的一条路径；Path((v0, v1)(v1, v2)(v2, v3) (Vk-1, Vk));由k+1个节点构成k长度的路径
 *        忽略了边的方向，由单个节点，零条边构成的路径也是合法的 其长度为0
 *     5、除本身意外的所有祖先（后代）称为真祖先（后代）
 *     6、在一对节点u和v的所有共同祖先，深度最大的称为他们的最低共同祖先（Lowerest common ancestor）
 *     7、有序数、m叉树、二叉树binary tree
 * 观察结论1、树中节点的数目等于边数+1
 *        2、高度为h的二叉树最多包涵2 k+1次方 -1个节点
 */
public interface Tree {
    Object getElement();

    Object setElement(Object obj);

    // 返回当前节点的父节点
    TreeLinkedList getParent();

    TreeLinkedList getFirstChild();

    TreeLinkedList getNextSibling();

    int getSize();
    int getHeight();
    int getDepth();
}
