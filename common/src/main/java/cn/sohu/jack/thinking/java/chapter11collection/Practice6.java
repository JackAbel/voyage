package cn.sohu.jack.thinking.java.chapter11collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author jinxianbao
 * @date 2019/4/14 8:01 PM
 */
public class Practice6 {


    static String[] strings = {"sg", "sg"};

    static List<String> apple = new ArrayList<String>(Arrays.asList(strings));

    public static void main(String[] args) {
        apple.subList(0, 1);
        Apple sg = new Apple();
        Apple[] apples = {sg, new Apple(), new Apple()};
        List<Apple> appleList = new ArrayList<Apple>(Arrays.asList(apples));
        List<Apple> appleListSup = appleList.subList(1, 2);
        appleList.removeAll(appleListSup);
        System.out.println(appleList.size());

    }
}
