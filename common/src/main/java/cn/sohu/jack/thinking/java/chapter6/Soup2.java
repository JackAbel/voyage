package cn.sohu.jack.thinking.java.chapter6;

/**
 * @author jinxianbao
 * @date 2019/3/10 6:10 PM
 */
class Soup2 {
    private Soup2() {

    }
    private static Soup2 soup2 = new Soup2();

    public static Soup2 makeSoup2() {
        return soup2;
    }

    public void f() {

    }
}
