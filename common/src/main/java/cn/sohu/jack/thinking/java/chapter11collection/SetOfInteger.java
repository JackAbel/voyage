package cn.sohu.jack.thinking.java.chapter11collection;

import java.util.*;

/**
 * @author jinxianbao
 * @date 2019/4/16 9:56 AM
 */
public class SetOfInteger {
    public static void main(String[] args) {
        Random rand = new Random(49);
        Set<Integer> testSet = new HashSet<>();
        Set<String> stringSet = new HashSet<>();
        SortedSet<Integer> treeSet = new TreeSet<>();
        stringSet.add("sg");
        stringSet.add("sge");
        stringSet.add("sgsg");
        stringSet.add("sgw");
        stringSet.add("sgse");
        stringSet.add("sgrs");
        for (int i = 0; i < 1000; i++) {
            testSet.add(rand.nextInt(30));
            treeSet.add(rand.nextInt(30));
        }
        System.out.println(testSet);
        System.out.println(treeSet);
        // prove hashSet is not sorted
        System.out.println(stringSet);
    }
}
