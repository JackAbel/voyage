package cn.sohu.jack.thinking.java.chapter11collection;

import java.util.*;

/**
 * @author jinxianbao
 * @date 2019/4/18 11:36 AM
 */
public class Practice24 {
    private static String testExample = "whether the weather is cold or hot, whether the weather is windy or clam, The men should be exercise";

    public static void main(String[] args) {
        LinkedHashMap<String, StringInteger>  linkedHashMaps = new LinkedHashMap<>();
        for (String s : testExample.split(" ")) {
            linkedHashMaps.put(s, new StringInteger(s, 1));
        }
        List<String> stringList = new ArrayList<>();
        stringList.addAll(linkedHashMaps.keySet());
        Collections.sort(stringList, String.CASE_INSENSITIVE_ORDER);
        for (String s : stringList) {
            StringInteger stringInteger = linkedHashMaps.get(s);
            linkedHashMaps.remove(s);
            linkedHashMaps.put(s, stringInteger);
        }
        System.out.println(linkedHashMaps);

    }
}
