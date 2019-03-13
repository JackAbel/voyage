package cn.sohu.jack.thinking.java.chapter6;

/**
 * @author jinxianbao
 * @date 2019/3/10 6:08 PM
 */
public class Lunch {
    void privateTest() {
        //
        // Soup2 soup2; = new Soup2();
    }

    void staticTest() {
        Soup1 soup1 = Soup1.makeSoup();
    }

    void singletonTest() {
        Soup2.makeSoup2().f();
    }
}
