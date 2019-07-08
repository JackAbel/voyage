package cn.sohu.jack.thinking.java.chapter15generics;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/6/18 5:46 PM
 */
public class IntegerFactory implements FactoryI<Integer> {
    public Integer create() {
        return 0;
    }
}
