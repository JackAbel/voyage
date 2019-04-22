package cn.sohu.jack.thinking.java.chapter11collection;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author jinxianbao
 * @date 2019/4/16 11:13 AM
 */
public class MapOfList {
    public static Map<String, List<String>> petPeole = new HashMap<>();
    static {
        petPeole.put("Susan", Arrays.asList("dog", "cat", "mouse"));
    }

    public static void main(String[] args) {
        System.out.println(petPeole.containsValue(Arrays.asList("dog", "cat", "mouse")));
    }
}
