package cn.sohu.jack.datastructureandarithmatic;

/**
 * @description: 序列实现
 * @author: Xiangbao Jin
 * @since 2020/9/24 10:54 PM
 */
public class Sequence_DLnode extends List_DLNode implements Sequence {

    protected void check(int r, int n) throws ExceptionBoundaryViolation {
        if (r < 0 || r >= n) {
            throw new ExceptionBoundaryViolation("检查的位置越界");
        }
    }
    @Override
    public Position rank2pos(int r) throws ExceptionBoundaryViolation {
        DLNode node;
        check(r, getSize());
        if (r < getSize() / 2) {
            node = header.next();
            for (int i = 0; i < r; r++) {
                node = node.next();
            }
        } else {
            node = trailer.pre();
            for (int i = 1; i < getSize() - r; i++) {
                node = node.pre();
            }
        }
        return node;
    }

    @Override
    public int pos2rank(Position p) throws ExceptionPositionInvalid {
        DLNode node = header.next();
        int r = 0;
        while (node != trailer) {
            if (node == p) {
                return r;
            }
            node = node.next();
            r++;
        }
        throw new ExceptionPositionInvalid("传人的位置在此序列中没有值");
    }

    @Override
    public Object getAtRank(int r) throws ExceptionBoundaryViolation {
        check(r, getSize());
        return rank2pos(r);
    }

    @Override
    public Object insertAtRank(int r, Object obj) throws ExceptionBoundaryViolation {
        check(r, getSize()+1);
        if (r == getSize()) {
            insertLast(obj);
        } else {
            insertPrev(rank2pos(r), obj);
        }
        return obj;
    }

    @Override
    public Object replaceAtRank(int r, Object obj) throws ExceptionBoundaryViolation {
        check(r, getSize());
        return replace(rank2pos(r), obj);
    }

    @Override
    public Object removeAtRank(int r) throws ExceptionBoundaryViolation {
        check(r, getSize());
        return remove(rank2pos(r));
    }
}
