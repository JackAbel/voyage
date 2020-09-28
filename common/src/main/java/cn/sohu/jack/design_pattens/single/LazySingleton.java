package cn.sohu.jack.design_pattens.single;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2020/9/13 10:04 PM
 */
public final class LazySingleton {
    private byte[] data = new byte[1024];

    private static LazySingleton singleton = null;
    private LazySingleton() {
    }

    public static LazySingleton getInstance(){
        if (singleton == null) {
            return new LazySingleton();
        }
        return singleton;
    }
}
