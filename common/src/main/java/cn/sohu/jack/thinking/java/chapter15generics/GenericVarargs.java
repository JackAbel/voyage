package cn.sohu.jack.thinking.java.chapter15generics;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/6/16 4:28 PM
 */
public class GenericVarargs {
    public static <T> List<T> makeList(T... args) {
        List<T> result = new ArrayList<>();
        for (T item : args) {
            result.add(item);
        }
        return result;
    }
}
