package cn.sohu.jack.thinking.java.chapter14TypeInformation;

import java.util.Random;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019.5.28 10:10 PM
 */
public class ClassInitialization {
    public static Random rand = new Random(47);

    public static void main(String[] args) throws Exception {
        Class initable = Initable.class;
        System.out.println("After creating Initable ref");
        System.out.println(Initable.STATICFINAL);
        System.out.println("----------");
        System.out.println(Initable.STATICFINAL2);
        System.out.println(Initable2.STATICFINAL);
        Class initable3 = Class.forName("cn.sohu.jack.thinking.java.chapter14TypeInformation.Initable3");
        System.out.println("After creating Initable3 ref");
        System.out.println(Initable3.STATICFINAL);
    }
}
