package cn.sohu.jack.thinking.java.chapter9interface;

/**
 * @author jinxianbao
 * @date 2019/3/19 10:11 AM
 */
public abstract class AbstractJava_9_4_14 extends Processor implements SecondOneMethod {

    public int firstInt(int i) {
        return i;
    }

    @Override
    public void firstVoid() {
        System.out.println("firstVoid()");
    }

    public int twoInt(int i) {
        return i;
    }

    public String two() {
        return "hi";
    }

    public int threeInt(int i) {
        return i;
    }

    public String threeString() {
        return "brother";
    }

    public String second() {
        return "how are you";
    }

    public static void f(FirstTwoMethod1 x) {
        x.firstInt(11);
        x.firstVoid();
    }

    public static void s(FirstTwoMethod2 x) {
        x.twoInt(11);
        x.two();
    }

    public static void t(FirstTwoMethod3 x) {
        x.threeInt(11);
        x.threeString();
    }

    public static void four(SecondOneMethod x) {
        x.firstInt(11);
        x.firstVoid();
        x.second();
    }

    public static void main(String[] args) {
        AbstractJava_9_4_14 java_9_4_14 = new AbstractImpl();
        f(java_9_4_14);
        t(java_9_4_14);
        s(java_9_4_14);
        four(java_9_4_14);
    }
}
