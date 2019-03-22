package cn.sohu.jack.thinking.java.chapter10innerclass;

/**
 * @author jinxianbao
 * @date 2019/3/20 8:42 AM
 */
public interface Selector {
    boolean end();
    Object current();
    void next();
}
