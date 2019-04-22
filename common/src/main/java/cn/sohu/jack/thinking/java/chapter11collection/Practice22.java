package cn.sohu.jack.thinking.java.chapter11collection;

import cn.sohu.jack.thinking.java.chapter6.Connection;

import java.util.*;

/**
 * @author jinxianbao
 * @date 2019/4/17 10:44 AM
 */
public class Practice22 {
    public static void main(String[] args) {
        String testExample = "whether the weather is cold or hot, whether the weather is windy or clam, The men should be exercise";
        Set<StringInteger> wordCount = new HashSet<>();
        List<String> testList = new ArrayList<>(Arrays.asList(testExample.split(" ")));
        Collections.sort(testList, String.CASE_INSENSITIVE_ORDER);

        a:for (String s : testList) {
            StringInteger w = new StringInteger(s, 1);
            if (wordCount.contains(w)) {
                for (StringInteger si : wordCount) {
                    if (si.word.equals(s)) {
                        wordCount.remove(si);
                        wordCount.add(new StringInteger(w.word, w.num + 1));
                        continue a;
                    }
                }
            } else {
                wordCount.add(w);
            }

        }
        for (StringInteger s2 : wordCount) {
            System.out.println(s2.toString());
        }
    }
}
