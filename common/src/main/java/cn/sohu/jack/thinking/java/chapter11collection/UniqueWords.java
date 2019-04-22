package cn.sohu.jack.thinking.java.chapter11collection;

import java.util.*;

/**
 * @author jinxianbao
 * @date 2019/4/16 10:33 AM
 */
public class UniqueWords {
    public static void main(String[] args) {
        Set<Character> vowel = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        String testString = "living, we have should explore our future";
        List<String> listString = new ArrayList<>(Arrays.asList(testString.split(" ")));
        int sumCount = 0;
        for (String s : listString) {
            int vowels = 0;
            for (char c : s.toCharArray()) {
                if (vowel.contains(c)) {
                    vowels++;
                    sumCount++;
                }
            }
            System.out.println(s + ".vowels = " + vowels);
        }
        System.out.println("The vowels of whole sentence = " + sumCount);
    }
}
