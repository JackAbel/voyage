package cn.sohu.jack.thinking.java.chapter8polymorphism;

/**
 * @author jinxianbao
 * @date 2019/3/14 9:38 PM
 */
public class Characteristic {
    private String s;

    Characteristic(String s) {
        this.s = s;
        System.out.println("Create Characteristic " + s);
    }

    protected void dispose() {
        System.out.println("disposing Characteristic " + s);
    }
}
