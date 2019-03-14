package cn.sohu.jack.thinking.java.chapter8polymorphism;

/**
 * @author jinxianbao
 * @date 2019/3/14 9:47 PM
 */
public class Amphibian extends Animal {
    private Characteristic a = new Characteristic("can live in water");
    private Description p = new Description("both water and land");

    Amphibian() {
        System.out.println("Amphibian()");
    }

    protected void dispose() {
        System.out.println("Amphibian dispose");
        a.dispose();
        p.dispose();
        super.dispose();
    }
}
