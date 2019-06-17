package cn.sohu.jack.thinking.java.chapter14TypeInformation;

import java.util.Arrays;

/**
 * @description: 递归找出类的所有继承类
 * @author: Xiangbao Jin
 * @since 2019/5/26 10:42 PM
 */
public class Practice8 {
    public static void findParent(Object obj) {
        if (obj.getClass().getSuperclass() != null) {
            System.out.println(Arrays.toString(obj.getClass().getDeclaredFields()));
            System.out.println(obj.getClass().getSuperclass().getSimpleName());
            try {
                findParent(obj.getClass().getSuperclass().newInstance());
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        try {
            findParent(new FancyToy());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
