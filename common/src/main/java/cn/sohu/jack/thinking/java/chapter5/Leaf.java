package cn.sohu.jack.thinking.java.chapter5;

/**
 * @author jinxianbao
 * @date 2019/3/8 10:05 AM
 */
public class Leaf {
    private int i = 0;

    Leaf increment() {
        i++;
        printNum();
        this.printNum();
        return this;
    }

    void printNum() {
        System.out.println("i = " + i);
    }

    public static void main(String[] args) {
        Leaf leaf = new Leaf();
        leaf.increment().increment().increment().printNum();
    }
}
