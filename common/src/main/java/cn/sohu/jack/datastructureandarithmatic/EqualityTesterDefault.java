package cn.sohu.jack.datastructureandarithmatic;

/**
 * @description: 默认比较器
 * @author: Xiangbao Jin
 * @since 2020/9/27 10:20 PM
 */
public class EqualityTesterDefault implements EqualityTester {
    @Override
    public boolean equalTo(Object k1, Object k2) {
        if (k1 == null) {
            return null == k2;
        } else {
            return k1.equals(k2);
        }
    }
}
