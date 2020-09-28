package cn.sohu.jack.datastructureandarithmatic;

/**
 * @description: 自定义二叉树实现
 * @author: Xiangbao Jin
 * @since 2020/9/26 7:27 PM
 */
public class BinTeeNode implements BinTreePosition {

    protected BinTreePosition parent;
    protected BinTreePosition lChild;
    protected BinTreePosition rChild;
    protected Object e;
    // 后代的数目
    protected int size;
    protected int height;
    protected int depth;

    public BinTeeNode() {

    }

    public BinTeeNode(Object e, BinTreePosition p, boolean asLchild, BinTreePosition l, BinTreePosition r) {
        size = 1;
        height = depth = 0;
        // 初始化
        parent = lChild = rChild = null;
        // 确认与父节点的关系
        if (null != p) {
            if (asLchild) {
                p.attachL(this);
            } else {
                p.attachR(this);
            }
        }
        // 确认与自节点的关系
        if (l != null) {
            attachL(l);
        }
        if (r != null) {
            attachR(r);
        }
    }
    @Override
    public boolean hasParent() {
        return parent != null;
    }
    @Override
    public boolean hasLChild() {
        return lChild != null;
    }
    @Override
    public boolean hasRChild() {
        return rChild != null;
    }

    @Override
    public BinTreePosition getParent() {
        return parent;
    }

    @Override
    public void setParent(BinTreePosition b) {
        parent = b;
    }

    @Override
    public boolean isLeaf() {
        return (hasParent() && null == getParent().getLChild() && null == getParent().getRChild());
    }

    @Override
    public boolean isLChild() {
        return (hasParent() && this == getParent().getLChild());
    }

    @Override
    public void setLChild(BinTreePosition b) {
        lChild = b;
    }

    @Override
    public BinTreePosition getLChild() {
        return this.lChild;
    }

    @Override
    public boolean isRChild() {
        return (hasParent() && this == getParent().getRChild());
    }

    @Override
    public void setRChild(BinTreePosition b) {
        rChild = b;
    }

    @Override
    public BinTreePosition getRChild() {
        return this.rChild;
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public void updateSize() {
        size = 1;
        if (hasLChild()) {
            size += getLChild().getSize();
        }
        if (hasRChild()) {
            size += getRChild().getSize();
        }
        if (hasParent()) {
            getParent().updateSize();
        }
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public void updateHeight() {
        height = 0;
        if (hasLChild()) {
            height = Math.max(height, 1+getLChild().getHeight());
        }
        if (hasRChild()) {
            height = Math.max(height, 1+getRChild().getHeight());
        }
        if (hasParent()) {
            getParent().updateHeight();
        }
    }

    @Override
    public int getDepth() {
        return depth;
    }

    @Override
    public void updateDepth() {
        if (!hasParent()) {
            depth = 0;
        } else {
            depth = getParent().getDepth() +1;
        }
        if (hasLChild()) {
            getLChild().updateDepth();
        }
        if (hasRChild()) {
            getRChild().updateDepth();
        }
    }

    // 按照中序遍历，找出当前节点的直接前驱
    @Override
    public BinTreePosition getPre() {
        if (hasLChild()) {
            return findMaxDescendant(getLChild());
        }
        if (isRChild()) {
            return parent;
        }
        BinTreePosition v = this;
        while (v.isLChild()) {
            v = v.getParent();
        }

        return v.getParent();
    }

    @Override
    public BinTreePosition getSucc() {
        if (hasRChild()) {
            return findMinDescendant(getRChild());
        }
        if (isLChild()) {
            return parent;
        }
        BinTreePosition v = this;
        while (v.isRChild()) {
            v = v.getParent();
        }

        return v.getParent();
    }

    // 获得当前节点
    public BinTreePosition secede() {
        if (null != parent) {
            if (isLChild()) {
                parent.setLChild(null);
            } else {
                parent.setRChild(null);
            }
        }
        parent.updateSize();
        parent.updateHeight();
        updateDepth();
        return this;
    }

    @Override
    public BinTreePosition attachL(BinTreePosition c) {
        if (hasLChild()) {
            getLChild().secede();
        }
        if (c != null) {
            // 脱离原父亲
            c.secede();
            lChild = c;
            updateHeight();
            updateSize();
            c.updateDepth();
        }


        return this;
    }

    @Override
    public BinTreePosition attachR(BinTreePosition c) {
        if (hasRChild()) {
            getRChild().secede();
        }
        if (c != null) {
            c.secede();
            rChild = c;
            updateSize();
            updateHeight();
            c.updateDepth();
        }
        return this;
    }

    @Override
    public Iterator ElementsPreOrder() {
        List list = new List_DLNode();
        preOrder(list, this);
        return list.elements();
    }

    @Override
    public Iterator ElementsInOrderElements() {
        List list = new List_DLNode();
        inOrder(list, this);
        return list.elements();
    }

    @Override
    public Iterator ElementsPostOrderElements() {
        List list = new List_DLNode();
        postOrder(list, this);
        return list.elements();
    }

    @Override
    public Object setElem(Object e) {
        Object bak = this.e;
        this.e = e;
        return bak;
    }

    @Override
    public Object getElem() {
        return this.e;
    }

    // 辅助方法，找出最小者
    protected static BinTreePosition findMinDescendant(BinTreePosition v) {
        if (null != v) {
            while (v.hasLChild()) {
                v = v.getLChild();
            }
        }
        return v;
    }

    // 找出最大者
    protected static BinTreePosition findMaxDescendant(BinTreePosition v) {
        if (null != v) {
            while (v.hasRChild()) {
                v = v.getRChild();
            }
        }
        return v;
    }

    // 以v为根节点，进行前序遍历
    private static void preOrder(List list, BinTreePosition v) {
        if (v == null) {
            return;
        }
        list.insertLast(v);
        if (v.hasLChild()) {
            preOrder(list, v.getLChild());
        }
        if (v.hasRChild()) {
            preOrder(list, v.getRChild());
        }
    }

    // 以v为根节点，进行中序遍历
    private static void inOrder(List list, BinTreePosition v) {
        if (v == null) {
            return;
        }
        if (v.hasLChild()) {
            inOrder(list, v.getLChild());
        }
        list.insertLast(v);
        if (v.hasRChild()) {
            inOrder(list, v.getRChild());
        }
    }

    // 以v为根节点，进行后序遍历
    private static void postOrder(List list, BinTreePosition v) {
        if (v == null) {
            return;
        }
        if (v.hasLChild()) {
            postOrder(list, v.getLChild());
        }
        if (v.hasRChild()) {
            postOrder(list, v.getRChild());
        }
        list.insertLast(v);
    }

}
