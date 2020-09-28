package cn.sohu.jack.datastructureandarithmatic;

/**
 * @description: 自己来实现向量接口
 * @author: Xiangbao Jin
 * @since 2020/9/18 11:09 PM
 */
public interface Vector {
    int getSize();
    boolean isEmpty();
    Object getAtRank(int r) throws ExceptionBoundaryViolation;
    Object insertAtRank(int r, Object obj) throws ExceptionBoundaryViolation;
    Object replaceAtRank(int r, Object obj) throws ExceptionBoundaryViolation;
    Object removeAtRank(int r) throws ExceptionBoundaryViolation;
}
