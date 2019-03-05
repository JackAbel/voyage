package cn.sohu.jack.thinking.java.chapter3;

import java.util.Random;

public class BitManipulation {
    public static void main(String[] args) {
        Random rand = new Random(47);
        int i = rand.nextInt();
        int j = rand.nextInt();
        printBinaryint("+1", +1);
        printBinaryint("-1", -1);
        int maxpos = 2147483617;
        int maxned = -2147483617;
        printBinaryint("maxpos", maxpos);
        printBinaryint("maxned", maxned);
        printBinaryint("i", i);
        printBinaryint("~i", ~i);
        printBinaryint("-i", -i); // 反码+1后变为原数的补码为 负数的二进制表示方式
        printBinaryint("j&i", j&i);
        printBinaryint("j|i", j|i);
        printBinaryint("j^i", j^i);
        printBinaryint("i << 5", i << 5);
        printBinaryint("~i << 5", (~i) << 5);
        printBinaryint("i >> 5", i >> 5);
        printBinaryint("~i >> 5", (~i) >> 5);
        printBinaryint("i >>> 5", i >>> 5);
        printBinaryint("~i >>> 5", (~i) >>> 5);

        Long l = rand.nextLong();
        Long m = rand.nextLong();
        printBinaryLong("+1L", +1L);
        printBinaryLong("-1L", -1L);
        Long ll = 9223372036854775807L;
        Long llm = -9223372036854775807L;
        printBinaryLong("ll", ll);
        printBinaryLong("llm", llm);
        printBinaryLong("l", l);
        printBinaryLong("~l", ~l);
        printBinaryLong("-l", -l);
        printBinaryLong("l&m", l&m);
        printBinaryLong("l|m", l|m);
        printBinaryLong("l^m", l^m);
        printBinaryLong("l << 5", l << 5);
        printBinaryLong("~l << 5", (~l) << 5);
        printBinaryLong("l >> 5", l >> 5);
        printBinaryLong("~l >> 5", (~l) >> 5);
        printBinaryLong("l >>> 5", l >>> 5);
        printBinaryLong("~l >>> 5", (~l) >>> 5);

    }
    private static void printBinaryint(String s, int i) {
        System.out.println(s + ".int: " + i + ".binary:\n " + Integer.toBinaryString(i));
    }
    private static void printBinaryLong(String s, Long i) {
        System.out.println(s + ".long: " + i + ".binary:\n " + Long.toBinaryString(i));
    }
}
