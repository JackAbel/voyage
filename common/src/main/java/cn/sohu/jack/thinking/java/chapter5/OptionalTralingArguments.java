package cn.sohu.jack.thinking.java.chapter5;

/**
 * @author jinxianbao
 * @date 2019/3/9 9:57 PM
 */
public class OptionalTralingArguments {
    static void f(int i, String... trailing) {
        System.out.println("i = " + i);
        for (String s : trailing) {
            System.out.println("s = " + s);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        f(1,"one");
        f(2,"two", "three");
        f(0);
    }
}
