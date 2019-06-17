package cn.sohu.jack.thinking.java.chapter15generics;

/**
 * @description: method of generic
 * @author: Xiangbao Jin
 * @since 2019/6/14 8:56 PM
 */
public class GenericMethods {
    public <T> void f(T f) {
        System.out.println(f.getClass().getName());
    }

    public static void main(String[] args) {
        GenericMethods genericMethods = new GenericMethods();
        genericMethods.f(12);
        genericMethods.f(" ");
        genericMethods.f(false);
        genericMethods.f(genericMethods);
        genericMethods.f('c');
        genericMethods.f(1.0);
        genericMethods.f(1.1F);
    }
}
