package cn.sohu.jack.thinking.java.chapter14TypeInformation;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/5/28 10:07 PM
 */
public class Initable3 {
    public static int STATICFINAL = 74;
    static {
        System.out.println("Initialize Initable3");
    }
}
