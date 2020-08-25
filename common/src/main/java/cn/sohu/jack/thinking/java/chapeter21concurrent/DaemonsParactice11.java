package cn.sohu.jack.thinking.java.chapeter21concurrent;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/8/16 8:03 PM
 */
public class DaemonsParactice11 {
    private int num1;
    private int num2;
    public boolean canced = false;

    public void setCanced() {
        canced = true;
    }

    public boolean getCanced() {
        return canced;
    }

    public synchronized int operateNext() {
        ++num1;
        ++num1;
        ++num2;
        return num1 + num2;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public static void main(String[] args) {
        EvenCheckerParatice11.test(new DaemonsParactice11());
    }
}
