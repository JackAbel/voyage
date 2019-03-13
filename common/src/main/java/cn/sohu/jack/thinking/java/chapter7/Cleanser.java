package cn.sohu.jack.thinking.java.chapter7;

/**
 * @author jinxianbao
 * @date 2019/3/10 8:22 PM
 */
public class Cleanser {
    protected static String test;
    private String s = "Cleanser";
    protected void append(String a) {
        s += a;
    }

    protected void dilute() {
        append(" dilute() ");
    }

    protected void apply() {
        append(" apply() ");
    }

    protected void apply(String i) {
        append(" apply(" + i + ") ");
    }

    protected void apply(int i) {
        append(" apply(" + i + ") ");
    }

    public void scrub() {
        append(" scrub() ");
    }

    public final void finalMethodTest() {
        System.out.println("final method don't have been override");
    }

    public String toString() {
        return s;
    }

    public static void main(String[] args) {
        Cleanser cleanser = new Cleanser();
        cleanser.dilute();
        cleanser.apply();
        cleanser.scrub();
        System.out.println(cleanser.toString());
    }
}
