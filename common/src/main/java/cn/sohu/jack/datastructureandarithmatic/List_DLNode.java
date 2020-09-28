package cn.sohu.jack.datastructureandarithmatic;

/**
 * @description: 双向队列
 * @author: Xiangbao Jin
 * @since 2020/9/23 10:04 PM
 */
public class List_DLNode implements List {
    protected int listNum;
    protected DLNode header;
    protected DLNode trailer;

    public List_DLNode() {
        listNum = 0;
        header = new DLNode(null, null, null);
        trailer = new DLNode(null, header, null);
        header.setNext(trailer);
    }

    /* 辅助方法检查position的合法性*/
    public DLNode checkDLNode(Position p) {
        if (null == p) {
            throw new ExceptionPositionInvalid("传递给List_DLNode的位置为null");
        }
        if (p == header) {
            throw new ExceptionPositionInvalid("头节点位置非法");
        }
        if (p == trailer) {
            throw new ExceptionPositionInvalid("末节点位置非法");
        }
        DLNode temp = (DLNode) p;
        return temp;
    }

    // 查询列表当前的规模
    public int getSize() {
        return listNum;
    }

    // 检查双向列表是否为空
    public boolean isEmpty() {
        return listNum == 0;
    }

    // 获得列表的第一个元素
    //@Override
    public Position getFirst() throws ExceptionListEmpty {
        if (isEmpty()) {
            throw new ExceptionListEmpty("意外：列表为空");
        }
        return header.next();
    }

    @Override
    public Position last() {
        if (isEmpty()) {
            throw new ExceptionListEmpty("意外：列表为空");
        }
        return trailer.pre();
    }

    @Override
    public Position getNext(Position p) throws ExceptionBoundaryViolation, ExceptionPositionInvalid {
        DLNode d = checkDLNode(p);
        DLNode next = d.next();
        if (next == trailer) {
            throw new ExceptionBoundaryViolation("异常，取值越出了后边界");
        }
        return next;
    }

    @Override
    public Position getPrev(Position p) throws ExceptionBoundaryViolation, ExceptionPositionInvalid {
        DLNode d = checkDLNode(p);
        DLNode pre = d.pre();
        if (pre == header) {
            throw new ExceptionBoundaryViolation("异常，取值越出了前边界");
        }
        return pre;
    }

    @Override
    public Position insertFirst(Object e) {
        DLNode dlNode = new DLNode(e, header, header.next());
        header.setNext(dlNode);
        header.next().setPre(dlNode);
        return dlNode;
    }

    @Override
    public Position insertLast(Object e) {
        DLNode dlNode = new DLNode(e, trailer.pre(), trailer);
        trailer.setPre(dlNode);
        trailer.pre().setNext(dlNode);
        return dlNode;
    }

    @Override
    public Position insertAfter(Position p, Object e) throws ExceptionPositionInvalid {
        DLNode v = checkDLNode(p);
        listNum++;
        DLNode dlNode = new DLNode(e, v, v.next());
        v.setNext(dlNode);
        v.next().setPre(dlNode);
        return dlNode;
    }

    @Override
    public Position insertPrev(Position p, Object e) throws ExceptionPositionInvalid {
        DLNode v = checkDLNode(p);
        listNum++;
        DLNode dlNode = new DLNode(e, v.pre(),v);
        v.setPre(dlNode);
        v.pre().setNext(dlNode);
        return dlNode;
    }

    @Override
    public Object remove(Position p) throws ExceptionPositionInvalid {
        DLNode v = checkDLNode(p);
        v.pre().setNext(v.next());
        v.next().setPre(v.pre());
        v.setPre(null);
        v.setNext(null);
        return v.getElem();
    }

    @Override
    public Object removeFirst() {
        return remove(header.next());
    }

    @Override
    public Object removeLast() {
        return remove(trailer.next());
    }

    @Override
    public Object replace(Position p, Object e) throws ExceptionPositionInvalid {
        DLNode v = checkDLNode(p);
        Object object = v.getElem();
        v.setElem(e);
        return object;
    }

    @Override
    public Iterator elements() {
        return null;
    }

    @Override
    public Iterator positions() {
        return null;
    }
}
