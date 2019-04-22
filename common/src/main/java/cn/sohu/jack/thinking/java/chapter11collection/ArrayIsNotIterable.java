package cn.sohu.jack.thinking.java.chapter11collection;

import java.util.Arrays;

/**
 * @author jinxianbao
 * @date 2019/4/21 6:19 PM
 */
public class ArrayIsNotIterable {
    static <T> void test(Iterable<T> iterable) {
        for (T t : iterable) {
            System.out.println(t + " ");
        }
    }

    public static void main(String[] args) {
        test(Arrays.asList(1, 2, 3));
        String[] testStrings = ("A B C").split(" ");
        // test(testStrings); 数组不能转化为Iterable
    }
}
