package cn.sohu.jack.datastructureandarithmatic;

/**
 * @description: 自定义实现映射
 * @author: Xiangbao Jin
 * @since 2020/9/27 9:51 PM
 */
public interface Map {
    boolean isEmpty();
    int getSize();

    Object get(Object element);
    Object put(Object key, Object value);
    Object remove(Object key);
    Iterator entries();

}
