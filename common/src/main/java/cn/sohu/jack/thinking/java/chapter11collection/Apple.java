package cn.sohu.jack.thinking.java.chapter11collection;

/**
 * @author jinxianbao
 * @date 2019/4/11 11:05 AM
 */
public class Apple {
    private static long counter;
    private final long id = counter++;

    public long id() {
        return id;
    }
}
