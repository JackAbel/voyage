package cn.sohu.jack.thinking.java.chapter7;

/**
 * @author jinxianbao
 * @date 2019/3/13 10:09 PM
 * The all process of class initialization
 */
public class Beetle extends Insect {
    private int k = printInit("Beetle'k initialized!");

    public Beetle() {
        System.out.println("k = " + k);
        System.out.println("j = " + j);
    }
    private static int x2 = printInit("Beetle'x2 initialized");

    public static void main(String[] args) {
        System.out.println("Beetle constructor");
        Beetle b = new Beetle();
    }
}
