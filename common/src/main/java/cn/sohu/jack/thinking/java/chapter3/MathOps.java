package cn.sohu.jack.thinking.java.chapter3;

import java.util.Random;

public class MathOps {
    public static void main(String[] args) {
        // created a seeded random number generator
        Random rand = new Random(47);
        int j = rand.nextInt(100) + 1;
        int k = rand.nextInt(100) + 1;
        System.out.println("j : " + j);
        System.out.println("k : " + k);
        int i = j + k;
        System.out.println("j + k : " + i);
        i = j * (-k);

    }
}
