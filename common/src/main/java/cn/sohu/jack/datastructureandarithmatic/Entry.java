package cn.sohu.jack.datastructureandarithmatic;

/**
 * @description: 条目对象接口
 * @author: Xiangbao Jin
 * @since 2020/9/26 10:19 PM
 */
public interface Entry {
    // 对关键码的操作
    Object setKey(Object v);
    Object getKey();

    // 对条目值的操作
    Object setValue(Object v);
    Object getValue();
}
