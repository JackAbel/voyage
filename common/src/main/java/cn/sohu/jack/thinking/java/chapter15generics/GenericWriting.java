package cn.sohu.jack.thinking.java.chapter15generics;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/6/21 4:33 PM
 */
public class GenericWriting {
    static <T> void writeExact(List<T> list, T item) {
        list.add(item);
    }
    static List<Apple> apples = new ArrayList<>();
    static List<Fruit> fruits = new ArrayList<>();

    static void f1() {
        writeExact(apples, new Apple());
        // writeExact(apples, new Fruit());
    }

    static <T> void writeWithWildWord(List<? super T> list, T item) {
        list.add(item);
    }

    static void f2() {
        writeWithWildWord(apples, new Apple());
        //writeWithWildWord(apples, new Fruit());
        writeWithWildWord(fruits, new Apple());
    }
}
