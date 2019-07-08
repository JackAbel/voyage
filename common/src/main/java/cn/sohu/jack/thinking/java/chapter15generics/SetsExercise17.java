package cn.sohu.jack.thinking.java.chapter15generics;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/6/17 9:16 AM
 */
public class SetsExercise17 {
    public static <T> Set<T> union(Set<T> a, Set<T> b) {
        try {
            if (a instanceof EnumSet) {
                Set<T> result = ((EnumSet)a).clone();
                result.addAll(b);
                return result;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Set<T> result = new HashSet<>(a);
        result.addAll(b);
        return result;
        // return a.addAll(b);
    }

    public static <T> Set<T> intersection(Set<T> a, Set<T> b) {
        Set<T> result = new HashSet<>(a);
        result.retainAll(b);
        return result;
    }

    public static <T> Set<T> difference(Set<T> superset, Set<T> subset) {
        Set<T> result = new HashSet<>(superset);
        result.removeAll(subset);
        return result;
    }

    public static <T> Set<T> complement(Set<T> a, Set<T> b) {
        return difference(union(a, b), intersection(a, b));
    }
}
