package cn.sohu.jack.thinking.java.chapter5;

import java.util.Arrays;

/**
 * @author jinxianbao
 * @date 2019/3/9 8:28 PM
 */
public class ArraryOfprimitives {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(args));
        int[] a1 = {1, 2, 3, 4, 5};
        int[] a2 = a1;
        for (int i = 0; i <= a1.length - 1; i++) {
            a2[i] = a1[i] + 1;
        }
        for (int i = 0; i <= a1.length - 1; i++) {
            System.out.println("a1[" + i + "] = " + a1[i]);
        }
    }

}
