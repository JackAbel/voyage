package cn.sohu.jack.datastructureandarithmatic;

/**
 * @description: 自定义列表
 * @author: Xiangbao Jin
 * @since 2020/9/22 10:46 PM
 */
public interface List {
    Position getFirst();
    Position last();
    // 获得位置p后的元素的位置
    Position getNext(Position p) throws ExceptionBoundaryViolation, ExceptionPositionInvalid;
    Position getPrev(Position p) throws ExceptionBoundaryViolation, ExceptionPositionInvalid;
    Position insertFirst(Object e);
    Position insertLast(Object e);
    // 在位置p后插入元素e，并返回新插入元素的位置
    Position insertAfter(Position p, Object e) throws ExceptionPositionInvalid;
    Position insertPrev(Position p, Object e) throws ExceptionPositionInvalid;

    Object remove(Position p) throws ExceptionPositionInvalid;
    Object removeFirst();
    Object removeLast();

    Object replace(Position p, Object e) throws ExceptionPositionInvalid;

    Iterator elements();
    Iterator positions();

    int getSize();

    boolean isEmpty();
}
