package cn.sohu.jack.thinking.java.chapter3;

// Surprise, Java lets you overflow;
public class Overflow {
    public static void main(String[] args) {
        int max = Integer.MAX_VALUE;
        int bigger = max * 4;
        System.out.println("max is " + max);
        System.out.println("max * 4 is " + bigger);
    }
}
