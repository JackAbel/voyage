package cn.sohu.jack.thinking.java.chapter9interface;

/**
 * @author jinxianbao
 * @date 2019/3/18 9:21 PM
 */
public abstract class StringProcesser implements ProcessImpl {
    public String name() {
        return getClass().getSimpleName();
    }
    public abstract String process(Object input);
}
