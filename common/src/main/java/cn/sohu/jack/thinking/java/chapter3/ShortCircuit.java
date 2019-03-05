package cn.sohu.jack.thinking.java.chapter3;

public class ShortCircuit {
    static boolean test1(int val1) {
        System.out.println("test1(" + val1 + ")");
        System.out.println("the result " + (val1 < 1));
        return val1 < 1;
    }
    static boolean test2(int val1) {
        System.out.println("test1(" + val1 + ")");
        System.out.println("the result " + (val1 < 1));
        return val1 < 2;
    }
    static boolean test3(int val1) {
        System.out.println("test1(" + val1 + ")");
        System.out.println("the result " + (val1 < 1));
        return val1 < 3;
    }

    public static void main(String[] args) {
        boolean b = test1(0) && test2(2) && test3(2);
        System.out.println("expression is " + b);
    }
}
