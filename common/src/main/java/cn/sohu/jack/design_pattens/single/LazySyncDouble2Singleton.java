package cn.sohu.jack.design_pattens.single;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2020/9/13 10:04 PM
 */
public final class LazySyncDouble2Singleton {
    private byte[] data = new byte[1024];

    private volatile static LazySyncDouble2Singleton singleton = null;
    private LazySyncDouble2Singleton() {
    }

    public static synchronized LazySyncDouble2Singleton getInstance(){
        if (singleton == null) {
            synchronized (LazySyncDouble2Singleton.class) {
                if (singleton == null) {
                    singleton = new LazySyncDouble2Singleton();
                }
            }
        }
        return singleton;
    }
}
