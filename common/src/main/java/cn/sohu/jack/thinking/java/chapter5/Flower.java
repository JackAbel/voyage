package cn.sohu.jack.thinking.java.chapter5;

/**
 * @author jinxianbao
 * @date 2019/3/8 10:23 AM
 */
public class Flower {
    int petalCount = 0;
    String s = "initial value";

    Flower(int petals) {
        petalCount = petals;
        System.out.println("Constructor int arg only, petalCount = " + petalCount);
    }

    Flower(String ss) {
        System.out.println("Constructor string arg only, s = " + ss);
        s = ss;
    }

    Flower(int petals, String s) {
        this(petals);
        //this(s); 不能在一个构造器中调用类的两个构造器，构造器的调用必须放在开始位置
        this.s = s;
        System.out.println("String & int args");
    }

    Flower() {
        this(47,"Hi");
        System.out.println("default constructor (no args)");
    }

    void printPetalCount() {
        //this(11) 不能在方法内部调用构造器
        System.out.println("petalCount = " + petalCount + " s = " + s);
    }

    public static void main(String[] args) {
        Flower x = new Flower();
        x.printPetalCount();
    }


}
