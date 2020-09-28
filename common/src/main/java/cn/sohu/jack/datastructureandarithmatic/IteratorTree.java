package cn.sohu.jack.datastructureandarithmatic;

import java.util.Iterator;

/**
 * @description: 树的遍历
 * @author: Xiangbao Jin
 * @since 2020/9/18 7:21 PM
 */
public class IteratorTree implements Iterator {

    private List list;
    private Position nextPosition;

    // 默认构造方法
    private IteratorTree() {
        list = null;
    }

    // 前序遍历
    public void elementsPreorderIterator(TreeLinkedList T) {
        if (null == T) {
            return;
        }
        list.insertLast(T);
        TreeLinkedList subtree = T.getFirstChild();
        while (null != subtree) {
            this.elementsPreorderIterator(subtree);
            subtree = subtree.getNextSibling();
        }
    }

    // 后序遍历
    public void elementsPostorderIterator(TreeLinkedList T) {
        if (null == T) {
            return;
        }
        TreeLinkedList subtree = T.getFirstChild();
        while (null != subtree) {
            this.elementsPostorderIterator(subtree);
            subtree = subtree.getNextSibling();
        }
        list.insertLast(T);
    }

    @Override
    public boolean hasNext() {
        return null != nextPosition;
    }

    @Override
    public Object next() throws ExceptionNoSuchElement{
        if (!hasNext()) {
            throw new ExceptionNoSuchElement("no such element");
        }
        Position currentPosition = nextPosition;
        if (currentPosition == list.last()) {
            nextPosition = null;
        } else {
            nextPosition = list.getNext(currentPosition);
        }
        return currentPosition.getElem();
    }
}
