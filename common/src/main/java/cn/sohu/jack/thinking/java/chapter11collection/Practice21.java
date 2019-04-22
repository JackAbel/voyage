package cn.sohu.jack.thinking.java.chapter11collection;

import java.util.*;

/**
 * @author jinxianbao
 * @date 2019/4/17 9:55 AM
 */
public class Practice21 {
    public static void main(String[] args) {
        String testExample = "whether the weather is cold or hot, whether the weather is windy or clam, The men should be exercise";
        Map<String, Integer> wordCount = new HashMap<>();
        for (String s : testExample.split(" ")) {
            wordCount.put(s, wordCount.get(s) == null? 1 : wordCount.get(s) + 1);
        }
        List<String> listWords = new ArrayList<>();
        listWords.addAll(wordCount.keySet());
        Collections.sort(listWords, String.CASE_INSENSITIVE_ORDER);
        for (String s : listWords) {
            System.out.println(s + " = " + wordCount.get(s));
        }
    }
}
