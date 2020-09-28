package cn.sohu.jack.design_pattens.single;

/**
 * @description: 一个类的成员变量不多，且占用内存资源较少，可以使用饿汉式，
 *               总结它可以保证多个线程下唯一实例，getInstance方法性能较高，但是无法进行懒加载
 * @author: Xiangbao Jin
 * @since 2020/9/13 10:04 PM
 */
public final class HungerSingleton {
    private byte[] data = new byte[1024];

    private static HungerSingleton singleton = new HungerSingleton();
    private HungerSingleton() {
    }

    public static HungerSingleton getInstance(){
        return singleton;
    }
}
