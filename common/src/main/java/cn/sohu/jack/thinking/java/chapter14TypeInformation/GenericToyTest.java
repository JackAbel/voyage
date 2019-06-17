package cn.sohu.jack.thinking.java.chapter14TypeInformation;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/6/2 9:12 PM
 */
public class GenericToyTest {
    public static void main(String[] args) throws Exception{
        Class<FancyToy> ftClass = FancyToy.class;
        // produce extra class
        FancyToy fancyToy = ftClass.newInstance();
        Class<? super FancyToy> up = ftClass.getSuperclass();
        // this won't compile
        // Class<Toy> up2 = ftClass.getSuperclass();
        Object obj = up.getSuperclass();
    }
}
