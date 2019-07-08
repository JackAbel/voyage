package cn.sohu.jack.thinking.java.chapter15generics;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/6/21 5:19 PM
 */
public class UnBoundedWildcards {
    static List list3;
    static List<?> list1;
    static List<? extends Object> list2;

    static void assign1(List list) {
        list3 = list;
        list1 = list;
        list2 = list;
    }

    static void assign2(List<?> list) {
        list3 = list;
        list1 = list;
        list2 = list;
    }

    static void assign3(List<? extends Object> list) {
        list1 = list;
        list2 = list;
        list3 = list;
    }

    public static void main(String[] args) {
        assign1(new ArrayList());
        assign2(new ArrayList());
        assign3(new ArrayList());
    }
}
