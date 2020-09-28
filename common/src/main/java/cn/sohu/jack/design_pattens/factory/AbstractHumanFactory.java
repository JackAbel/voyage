package cn.sohu.jack.design_pattens.factory;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2020/9/12 10:04 PM
 */
public abstract class AbstractHumanFactory<T> {
    public abstract T createHuman(Class<? extends T> c);
}
