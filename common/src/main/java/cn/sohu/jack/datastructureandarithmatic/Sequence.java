package cn.sohu.jack.datastructureandarithmatic;

/**
 * @description: 由列表和向量组合而成的序列
 * @author: Xiangbao Jin
 * @since 2020/9/24 10:45 PM
 */
public interface Sequence extends Vector, List {
    // 0 <= r < getSize 返回轶为r的元素的位置
    Position  rank2pos(int r) throws ExceptionBoundaryViolation;
    // 返回位置p所在元素的轶
    int pos2rank(Position p) throws ExceptionPositionInvalid;
}
