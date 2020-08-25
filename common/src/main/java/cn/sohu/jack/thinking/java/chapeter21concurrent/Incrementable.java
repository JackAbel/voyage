package cn.sohu.jack.thinking.java.chapeter21concurrent;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/9/27 7:04 PM
 */
public abstract class Incrementable {
    protected long counter = 0;
    public abstract void increament();
}
