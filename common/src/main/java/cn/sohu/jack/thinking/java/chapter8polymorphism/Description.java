package cn.sohu.jack.thinking.java.chapter8polymorphism;

/**
 * @author jinxianbao
 * @date 2019/3/14 9:38 PM
 */
public class Description {
    private String s;

    Description(String s) {
        this.s = s;
        System.out.println("Create Description " + s);
    }

    protected void dispose() {
        System.out.println("disposing Description " + s);
    }
}
