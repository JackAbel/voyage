package cn.sohu.jack.datastructureandarithmatic;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2020/9/17 10:35 PM
 */
public class TreeLinkedList implements Tree {
    // 树根节点
    private Object element;
    private TreeLinkedList parent, firstChild, nextSibling;

    // 单节点树
    private TreeLinkedList() {
        this(null, null, null, null);
    }

    public TreeLinkedList(Object e, TreeLinkedList p, TreeLinkedList c, TreeLinkedList s) {
        this.element = e;
        this.parent = p;
        this.firstChild = c;
        this.nextSibling = s;
    }

    @Override
    public Object getElement() {
        return element;
    }

    @Override
    public Object setElement(Object obj) {
        Object bak = element;
        element = obj;
        return bak;
    }

    @Override
    public TreeLinkedList getParent() {
        return parent;
    }

    @Override
    public TreeLinkedList getFirstChild() {
        return firstChild;
    }

    @Override
    public TreeLinkedList getNextSibling() {
        return nextSibling;
    }

    @Override
    public int getSize() {
        int size = 1;
        TreeLinkedList subTree = firstChild;
        while (null != subTree) {
            size += subTree.getSize();
            subTree = subTree.nextSibling;
        }
        return size;
    }

    @Override
    public int getHeight() {
        int height = -1;
        TreeLinkedList subTree = firstChild;
        while (null != subTree) {
            height = Math.max(subTree.getHeight(), height);
            subTree = subTree.nextSibling;
        }
        return height + 1; //返回当前节点的高度
    }

    @Override
    public int getDepth() {
        int depth = 0;
        TreeLinkedList p = parent;
        while (null != p) {
            depth++;
            p = p.parent; //访问各个真祖先
        }
        return depth; //真祖先的数目，即为当前节点的深度
    }
}
