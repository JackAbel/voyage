package cn.sohu.jack.thinking.java.chapter16array;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/7/2 8:52 AM
 */
public class CopyingArrays {
    public static void main(String[] args) {
        int[] i = new int[7];
        int[] y = new int[10];
        Arrays.fill(i, 47);
        Arrays.fill(y, 27);
        System.arraycopy(i, 0, y, 0, i.length);
        System.out.println("j = " + Arrays.toString(y));
        int[] k = new int[5];
        Arrays.fill(k, 113);
        System.arraycopy(k, 0, i, 0, k.length);
        System.out.println("i = " + Arrays.toString(i));
        Arrays.fill(i, 124);
        System.out.println("i = " + Arrays.toString(i));
    }
}
