package cn.sohu.jack.thinking.java.chapter14TypeInformation;

import java.lang.reflect.InvocationTargetException;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/6/11 7:45 PM
 */
public class ToyTest19 {
    public static void main(String[] args) {
        try {
            Toy c = Toy.class.getDeclaredConstructor(int.class).newInstance(12);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
