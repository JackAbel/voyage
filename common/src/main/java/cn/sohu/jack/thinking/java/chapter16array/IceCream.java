package cn.sohu.jack.thinking.java.chapter16array;

import java.util.Arrays;
import java.util.Random;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/6/25 9:55 PM
 */
public class IceCream {
    private static Random rand = new Random(47);
    static final String[] FLAVORS = {"Chocolate","Strawberry","Vanilla Fudge Swirl", "Mint Chip"};

    public static String[] setFlavors(int n) {
        if (n > FLAVORS.length) {
            throw new IllegalArgumentException("Set too long");
        }
        String[] results = new String[n];
        boolean[] picked = new boolean[FLAVORS.length];
        for (int i = 0; i < n; i++) {
            int t;
            do {
                t =rand.nextInt(FLAVORS.length);

            } while (picked[t]);
            results[i] = FLAVORS[t];
            picked[t] =true;
        }
        return results;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(setFlavors(3)));
    }
}
