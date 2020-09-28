package cn.sohu.jack.datastructureandarithmatic;

/**
 * @description: 优先队列的接口定义
 * @author: Xiangbao Jin
 * @since 2020/9/27 9:12 AM
 */
public interface PQuene {
    // 获取队列的大小
    int getSize();
    // 判断队列是否为空
    boolean isEmpty();

    Entry getMin() throws ExceptionPQueneEmpty;

    Entry insertEntry(Object k1, Object v1) throws ExceptionKeyInvaild;

    Entry delMin() throws ExceptionPQueneEmpty;
}
