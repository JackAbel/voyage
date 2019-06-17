package cn.sohu.jack.thinking.java.chapter15generics;

/**
 * @description: generic
 * @author: Xiangbao Jin
 * @since 2019/6/14 6:06 PM
 */
public class Holder3<T> {
    private T a;

    public Holder3(T a) {
        this.a = a;
    }

    public void setA(T a) {
        this.a = a;
    }

    public T getA() {
        return a;
    }

    public static void main(String[] args) {
        Holder3<AutoMobile> h3 = new Holder3<>(new AutoMobile());
        h3.getA();
        // h3.setA(12); error
    }

}
