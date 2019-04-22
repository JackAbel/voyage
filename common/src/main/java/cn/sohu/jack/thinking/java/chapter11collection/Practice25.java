package cn.sohu.jack.thinking.java.chapter11collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author jinxianbao
 * @date 2019/4/18 11:53 AM
 */
public class Practice25 {
    private static String testExample = "whether the weather is cold or hot, whether the weather is windy or clam, The men should be exercise";

    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> weMap = new HashMap<>();
        String[] testExamples = testExample.split(" ");

        for (int i = 0; i < testExamples.length; i++) {
            if (weMap.containsKey(testExamples[i])) {
                ArrayList<Integer> arrayList = weMap.get(testExamples[i]);
                arrayList.add(i);
                weMap.put(testExamples[i], arrayList);
            } else {
                weMap.put(testExamples[i], new ArrayList<>(Arrays.asList(i)));
            }
        }
        System.out.println(weMap);
    }
}
