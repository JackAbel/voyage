package cn.sohu.jack.thinking.java.chapter16array;

import java.util.Arrays;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/7/1 9:40 AM
 */
public class FillingArrays {
    public static void main(String[] args) {
        int size = 6;
        boolean[] a1 = new boolean[size];
        byte[] a2 = new byte[size];
        char[] a3 = new char[size];
        short[] a4 = new short[size];
        int[] a5 = new int[size];
        long[] a6 = new long[size];
        float[] a7 = new float[size];
        double[] a8 = new double[size];
        String[] a9 = new String[size];
        Arrays.fill(a1, true);
        System.out.println("a1 = " + Arrays.toString(a1));
        Arrays.fill(a2, (byte)11);
        System.out.println("a1 = " + Arrays.toString(a2));
        Arrays.fill(a3, 'c');
        System.out.println("a3 = " + Arrays.toString(a3));
        Arrays.fill(a4, (short)17);
        System.out.println("a4 = " + Arrays.toString(a4));
        Arrays.fill(a5, 12);
        System.out.println("a5 = " + Arrays.toString(a5));
        Arrays.fill(a6, 12341451);
        System.out.println("a6 = " + Arrays.toString(a6));
        Arrays.fill(a7, 23);
        System.out.println("a7 = " + Arrays.toString(a7));
        Arrays.fill(a8, 12.4);
        System.out.println("a8 = " + Arrays.toString(a8));
        Arrays.fill(a9, "s2");
        System.out.println("a9 = " + Arrays.toString(a9));
    }

}
