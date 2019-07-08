package cn.sohu.jack.thinking.java.chapter15generics;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/6/18 4:33 PM
 */
public class ArrayMaker<T> {
    private Class<T> kind;
    public ArrayMaker(Class<T> kind) {
        this.kind = kind;
    }
    @SuppressWarnings("unchecked")
    T[] create(int size) {
        return (T[]) Array.newInstance(kind,size);
    }

    public static void main(String[] args) {
        ArrayMaker<String> stringArrayMaker = new ArrayMaker<>(String.class);
        System.out.println(Arrays.toString(stringArrayMaker.create(9)));

    }

}
