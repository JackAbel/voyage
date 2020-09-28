package cn.sohu.jack.datastructureandarithmatic;

/**
 * @description: 自定义map key的判断接口
 * @author: Xiangbao Jin
 * @since 2020/9/27 10:18 PM
 */
public interface EqualityTester {
    //
    boolean equalTo(Object k1, Object k2);
}
