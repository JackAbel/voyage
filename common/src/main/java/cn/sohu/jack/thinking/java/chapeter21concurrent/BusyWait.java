package cn.sohu.jack.thinking.java.chapeter21concurrent;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/8/29 3:29 PM
 */
public class BusyWait {

    private boolean sign = false;
    public synchronized boolean isSign() {
        return sign;
    }

    public synchronized void setSign(boolean sign) {
        this.sign = sign;
    }

}
