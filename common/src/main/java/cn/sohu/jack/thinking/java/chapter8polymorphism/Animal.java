package cn.sohu.jack.thinking.java.chapter8polymorphism;

/**
 * @author jinxianbao
 * @date 2019/3/14 9:47 PM
 */
public class Animal extends LiveCreature {
    private Characteristic a = new Characteristic("has heart");
    private Description p = new Description("Animal not Vegetable");

    Animal() {
        System.out.println("Animal()");
    }

    protected void dispose() {
        System.out.println("Animal dispose");
        a.dispose();
        p.dispose();
        super.dispose();
    }
}
