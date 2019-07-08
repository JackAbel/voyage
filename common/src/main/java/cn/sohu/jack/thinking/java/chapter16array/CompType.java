package cn.sohu.jack.thinking.java.chapter16array;

import cn.sohu.jack.thinking.java.chapter15generics.Generator;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/7/2 9:27 AM
 */
public class CompType implements Comparable<CompType> {
    int i;
    int j;
    private static int count = 1;

    public CompType(int nn1, int nn2) {
        this.i = nn1;
        this.j = nn2;
    }

    public String toString() {
        String result = "[i = " + i + ", j = " + j + "]";
        if (count++ % 3 == 0) {
            result += "\n";
        }
        return result;
    }

    public int compareTo(CompType compType) {
        return (i < compType.i ? -1 : (i == compType.i ? 0 : 1));
    }
    private static Random r = new Random(47);

    public static Generator<CompType> generator() {
        return new Generator<CompType>() {
            @Override
            public CompType next() {
                return new CompType(r.nextInt(100), r.nextInt(100));
            }
        };
    }

    public static void main(String[] args) {
        CompType[] a = new CompType[12];
        for (int i = 0; i < a.length; i++) {
            a[i] = generator().next();
        }
        System.out.println("before sorting: ");
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("after sorting: ");
        System.out.println(Arrays.toString(a));
    }
}
