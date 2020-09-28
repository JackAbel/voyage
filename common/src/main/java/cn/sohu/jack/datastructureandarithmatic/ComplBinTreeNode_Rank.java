package cn.sohu.jack.datastructureandarithmatic;

/**
 * @description: 利用向量实现完全二叉树
 * @author: Xiangbao Jin
 * @since 2020/9/27 8:47 PM
 */
public class ComplBinTreeNode_Rank extends BinTeeNode implements BinTreePosition {
    private Vector vector; // 所属的树
    private int rank; // 所属树中的秩
    private Object object; // 存放的对象

    public ComplBinTreeNode_Rank(Vector v, Object e) {
        this.vector = v;
        this.object = e;
        rank = this.vector.getSize();
        vector.insertAtRank(rank, this);
    }


}
