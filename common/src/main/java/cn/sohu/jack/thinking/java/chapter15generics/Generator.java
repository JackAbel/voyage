package cn.sohu.jack.thinking.java.chapter15generics;

/**
 * @description: 生成器
 * @author: Xiangbao Jin
 * @since 2019/6/17 8:33 PM
 */
public interface Generator<T> {
    public T next();
}
