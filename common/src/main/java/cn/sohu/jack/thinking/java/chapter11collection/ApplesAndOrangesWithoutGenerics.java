package cn.sohu.jack.thinking.java.chapter11collection;

import java.util.ArrayList;

/**
 * @author jinxianbao
 * @date 2019/4/11 11:10 AM
 */
public class ApplesAndOrangesWithoutGenerics {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList apples = new ArrayList();
        for (int i = 0; i < 3; i++) {
            apples.add(new Apple());
        }
        apples.add(new Orange());
        for (int i = 0; i < apples.size(); i++) {
            ((Apple)apples.get(i)).id();
            // orange is detected only at running time
            // java.lang.ClassCastException
        }
    }
}
