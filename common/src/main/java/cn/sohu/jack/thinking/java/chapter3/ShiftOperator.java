package cn.sohu.jack.thinking.java.chapter3;

public class ShiftOperator {
    // 两个交替的1，0二进制位数
    private static final int var1 = 0x2a;
    private static final int var2 = 0x15;

    public static void main(String[] args) {
        System.out.println("var1 & var2 is " + Integer.toBinaryString((var1&var2)));
        System.out.println("var1 | var2 is " + Integer.toBinaryString((var1|var2)));
        System.out.println("var1 ^ var2 is " + Integer.toBinaryString((var1^var2)));

    }
}
