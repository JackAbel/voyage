package cn.sohu.jack.thinking.java.chapter16array;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/7/2 9:05 AM
 */
public class Practice19 {
    protected int a;

    public Practice19(int a) {
        this.a = a;
    }

    public boolean equals(Object b) {
        System.out.println(((Practice19)b).a);
        return (b.getClass().getSimpleName().equals("Practice19") && this.a == ((Practice19)b).a) ? true : false;
    }
}
