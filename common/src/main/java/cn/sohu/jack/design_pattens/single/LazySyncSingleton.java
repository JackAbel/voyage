package cn.sohu.jack.design_pattens.single;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2020/9/13 10:04 PM
 */
public final class LazySyncSingleton {
    private byte[] data = new byte[1024];

    private static LazySyncSingleton singleton = null;
    private LazySyncSingleton() {
    }

    public static synchronized LazySyncSingleton getInstance(){
        if (singleton == null) {
            return new LazySyncSingleton();
        }
        return singleton;
    }
}
