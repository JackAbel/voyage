package cn.sohu.jack.thinking.java.chapter11collection;

import java.util.*;

/**
 * @author jinxianbao
 * @date 2019/4/16 11:36 AM
 */
public class Practice18 {
    public static void main(String[] args) {
        Map<String,Integer> randMap = new HashMap<>();
        Map<String,Integer> LinkRandMap = new LinkedHashMap<>();
        randMap.put("da", 1);
        randMap.put("bc", 2);
        randMap.put("cd", 3);
        randMap.put("de", 4);
        List<String> ls = new ArrayList<>();
        for (String s : randMap.keySet()) {
               ls.add(s);
            System.out.print(s + " ");
        }
        ls.sort(null);
        for (String s : ls) {
            LinkRandMap.put(s, randMap.get(s));
        }
        System.out.println(LinkRandMap.keySet());
    }
}
