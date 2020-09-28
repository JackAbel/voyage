package cn.sohu.jack.datastructureandarithmatic;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2020/9/14 8:08 PM
 */
public class Node {
    private Object e;
    private Node next;

    public Node() {
        this(null, null);
    }

    public Node(Object e, Node node) {
        this.e  = e;
        this.next = node;
    }

    public Object getElem() {
        return this.e;
    }

    public Object setElem(Object e) {
        Object oldElement = e;
        this.e = e;
        return oldElement;
    }

    public Node next() {
        return next;
    }

    public void setNext(Node newNext) {
        next = newNext;
    }
}
