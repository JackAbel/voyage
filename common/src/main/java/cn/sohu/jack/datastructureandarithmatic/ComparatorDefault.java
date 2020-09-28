package cn.sohu.jack.datastructureandarithmatic;

/**
 * @description: 自定义比较器的默认实现
 * @author: Xiangbao Jin
 * @since 2020/9/27 9:06 AM
 */
public class ComparatorDefault implements Comparator {

    @Override
    public int compareTo(Object o1, Object o2) {
        return ((Comparable) o1).compareTo(o2);
    }
}
