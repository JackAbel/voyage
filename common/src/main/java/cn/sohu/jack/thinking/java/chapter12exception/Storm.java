package cn.sohu.jack.thinking.java.chapter12exception;

/**
 * @author jinxianbao
 * @date 2019/5/9 9:44 AM
 */
public interface Storm {
    void event() throws RainedOut;
    void rainHard() throws RainedOut;
}
