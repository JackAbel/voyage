package cn.sohu.jack.thinking.java.chapter16array;

import cn.sohu.jack.thinking.java.chapter15generics.Generator;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/7/1 10:21 AM
 */
public class GeneratorsTest {
    public static int size = 10;

    public static void test(Class<?> surroundingClass) {
        for (Class<?> type : surroundingClass.getClasses()) {
            System.out.println(type.getSimpleName() + ": ");
            try {
                Generator<?> g = (Generator<?>)type.newInstance();
                for (int i = 0; i < 10; i++) {
                    System.out.print(g.next() + " ");
                }
                System.out.println();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        test(CountingGenerator.class);
    }
}
