package cn.sohu.jack.thinking.java.chapeter21concurrent;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/8/15 9:15 PM
 */
public abstract class IntGenerator {
    private volatile boolean canceled = false;

    public abstract int next();

    public void cancel() {
        canceled = true;
    }

    public boolean isCanceled() {
        return canceled;
    }
}
