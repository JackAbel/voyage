package cn.sohu.jack.datastructureandarithmatic;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2020/9/14 8:08 PM
 */
public class DLNode implements Position{
    private Object e;
    private DLNode next;
    private DLNode pre;

    public DLNode() {
        this(null, null, null);
    }

    public DLNode(Object e, DLNode pre, DLNode next) {
        this.e  = e;
        this.pre = pre;
        this.next = next;
    }

    public Object getElem() {
        return this.e;
    }

    public Object setElem(Object e) {
        Object oldElement = e;
        this.e = e;
        return oldElement;
    }

    public DLNode next() {
        return next;
    }
    public DLNode pre() {
        return pre;
    }

    public void setNext(DLNode newNext) {
        next = newNext;
    }
    public void setPre(DLNode newNext) {
        pre = newNext;
    }
}
