package cn.sohu.jack.design_pattens.single;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2020/9/13 10:04 PM
 */
public final class HolderSingleton {
    private byte[] data = new byte[1024];

    private HolderSingleton() {
    }

    private static class Holder {
        private static HolderSingleton instance = new HolderSingleton();
    }
    public static HolderSingleton getInstance(){
        return Holder.instance;
    }
}
