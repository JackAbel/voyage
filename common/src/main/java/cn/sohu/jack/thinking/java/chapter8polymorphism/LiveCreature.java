package cn.sohu.jack.thinking.java.chapter8polymorphism;

/**
 * @author jinxianbao
 * @date 2019/3/14 9:43 PM
 */
public class LiveCreature {
    private Characteristic c = new Characteristic("is alive");
    private Description d = new Description("Basic Living Creature");

    LiveCreature() {
        System.out.println("LiveCreature()");
    }

    protected void dispose() {
        System.out.println("LiveCreature dispose");
        c.dispose();
        d.dispose();
    }
}
