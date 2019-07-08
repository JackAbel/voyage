package cn.sohu.jack.thinking.java.chapter16array;

import java.util.Arrays;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/7/2 9:17 AM
 */
public class Ex19 {
    public static void main(String[] args) {
        Practice19[] test = new Practice19[12];
        Practice19[] test2 = new Practice19[12];
        Arrays.fill(test, new Practice19(20));
        Arrays.fill(test2, new Practice19(20));
        System.out.println(Arrays.equals(test, test2));
    }
}
