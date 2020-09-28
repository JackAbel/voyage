package cn.sohu.jack.design_pattens.single;

/**
 * @description: 枚举方式实现单例模式
 * 枚举类型不允许被继承，同样是线程安全的且只能被实例化一次，但是枚举类型不能够懒加载，对Singleton主动使用，比如调用其中的静态方法则INSTANCE会立即得到实例化
 * @author: Xiangbao Jin
 * @since 2020/9/13 10:39 PM
 */
public enum  EnumSingleton {
    INSTANCE;
    private byte[] data = new byte[1024];

    EnumSingleton() {
        System.out.println("INSTANCE will be initialized immediately");
    }

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }
}
