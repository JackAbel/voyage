package cn.sohu.jack.thinking.java.chapter14TypeInformation;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/5/28 10:07 PM
 */
public class Initable {
    public final static int STATICFINAL = 47;
    public final static int STATICFINAL2 = ClassInitialization.rand.nextInt(1000);
    static {
        System.out.println("Initialize Initable");
    }
}
