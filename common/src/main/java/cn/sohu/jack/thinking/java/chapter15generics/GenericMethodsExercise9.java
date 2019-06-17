package cn.sohu.jack.thinking.java.chapter15generics;

/**
 * @description: method of generic
 * @author: Xiangbao Jin
 * @since 2019/6/14 8:56 PM
 */
public class GenericMethodsExercise9 {
    public <T, U, M> void f(T f, U s, M m) {
        System.out.println(f.getClass().getName());
        System.out.println(s.getClass().getName());
        System.out.println(m.getClass().getName());
    }

    public static void main(String[] args) {
        GenericMethodsExercise9 genericMethods = new GenericMethodsExercise9();
        genericMethods.f(12, "", 1.0);
    }
}
