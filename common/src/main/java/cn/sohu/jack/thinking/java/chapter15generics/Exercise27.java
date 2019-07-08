package cn.sohu.jack.thinking.java.chapter15generics;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/6/21 3:27 PM
 */
public class Exercise27 {

    public static void main(String[] args) {
        List<? extends Number> test2 = new ArrayList<Integer>();
        Number[] a = new Integer[12];
        Integer s = 12;
        a[0] = s;
        // test2.add(s); 协变性对List不起作用
        System.out.println(a[0]);

    }
}
