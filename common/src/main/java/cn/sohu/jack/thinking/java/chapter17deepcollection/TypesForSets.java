package cn.sohu.jack.thinking.java.chapter17deepcollection;

import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/7/8 6:10 PM
 */
public class TypesForSets {
    static <T> Set<T> fill(Set<T> t, Class<T> type) {
        try {
            for (int i = 0; i < 10; i++) {
                t.add(type.getConstructor(int.class).newInstance(i));
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return t;
    }

    static <T> void test(Set<T> set, Class<T> type) {
        fill(set,type);
        fill(set,type);
        fill(set,type);
        System.out.println(set);
    }

    public static void main(String[] args) {
        test(new HashSet<HashType>(), HashType.class);
        test(new LinkedHashSet<HashType>(), HashType.class);
        test(new TreeSet<Treetype>(), Treetype.class);
        test(new HashSet<SetType>(), SetType.class);
        test(new HashSet<Treetype>(), Treetype.class);
        test(new LinkedHashSet<Treetype>(), Treetype.class);
        test(new HashSet<SetType>(), SetType.class);

        try {
            test(new TreeSet<SetType>(), SetType.class);
            test(new TreeSet<HashType>(), HashType.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
