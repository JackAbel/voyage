package cn.sohu.jack.thinking.java.chapter15generics;

import java.util.List;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/6/21 4:28 PM
 */
public class SuperTypeWildCards {
    static void writeTo(List<? super Apple> apples) {
        apples.add(new Apple());
        // apples.add(new Fruit()) Error
        apples.add(new Jonathan());
    }
}
