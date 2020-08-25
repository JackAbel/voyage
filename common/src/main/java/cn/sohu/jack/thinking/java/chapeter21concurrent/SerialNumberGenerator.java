package cn.sohu.jack.thinking.java.chapeter21concurrent;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/8/23 1:15 PM
 */
public class SerialNumberGenerator {
    private static volatile int serialNumber = 0;

    public synchronized static int nextSerialNumber() {
        return serialNumber++; // not thread-safe
    }
}
