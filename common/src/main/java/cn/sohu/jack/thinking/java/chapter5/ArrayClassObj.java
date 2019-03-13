package cn.sohu.jack.thinking.java.chapter5;

import java.util.Arrays;
import java.util.Random;

/**
 * @author jinxianbao
 * @date 2019/3/9 8:40 PM
 */
public class ArrayClassObj {
    public static void main(String[] args) {
        Random rand = new Random(47);
        // 引用类型数组
        Integer[] a = new Integer[rand.nextInt(20)];
        // 基本类型数组
        int[] b = new int[rand.nextInt(14)];
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}
