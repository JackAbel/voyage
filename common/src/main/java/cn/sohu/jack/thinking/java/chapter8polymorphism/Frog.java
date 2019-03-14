package cn.sohu.jack.thinking.java.chapter8polymorphism;

/**
 * @author jinxianbao
 * @date 2019/3/14 9:53 PM
 */
public class Frog extends Amphibian {
    private Characteristic a = new Characteristic("Croaks");
    private Description p = new Description("Eats Bugs");

    Frog() {
        System.out.println("Frog()");
    }

    protected void dispose() {
        System.out.println("Frog dispose");
        a.dispose();
        p.dispose();
        super.dispose();
    }

    public static void main(String[] args) {
        Frog frog = new Frog();
        System.out.println("bye!");
        frog.dispose();
    }
}
