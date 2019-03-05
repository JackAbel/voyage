package cn.sohu.jack.thinking.java.chapter3;

public class Literals {
    public static void main(String[] args) {
        int i1 = 0x2f; // Hexadecimal (lowercase)
        int i2 = 0x2F; // Hexadecimal (lowercase)
        System.out.println("i1 is " + Integer.toBinaryString(i1));
        System.out.println("i2 is " + Integer.toBinaryString(i2));
        Long L1 = 0x34aL;
        Long L2 = 0x34al;
        System.out.println("L1 is " + Long.toBinaryString(L1));
        System.out.println("L2 is " + Long.toBinaryString(L2));
        Long L3 = 0177L;
        Long L4 = 0177l;
        System.out.println("L3 is " + Long.toBinaryString(L3));
        System.out.println("L4 is " + Long.toBinaryString(L4));


    }

}
