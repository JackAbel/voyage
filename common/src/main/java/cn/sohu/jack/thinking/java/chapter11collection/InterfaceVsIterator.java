package cn.sohu.jack.thinking.java.chapter11collection;

import java.util.*;

/**
 * @author jinxianbao
 * @date 2019/4/21 2:49 PM
 */
public class InterfaceVsIterator {
    public static void display(Iterator<String> iterator) {
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }

    public static void display(Collection<String> collection) {
        for (String s : collection) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        Set<String> stringSet = new HashSet<>();
        Map<Integer, String> stringMap = new LinkedHashMap<>();
        String[] strings = ("we have magnificent lifestyle and you have comfortable job").split(" ");
        for (int i = 0; i < strings.length; i++) {
            stringList.add(strings[i]);
            stringSet.add(strings[i]);
            stringMap.put(i, strings[i]);
        }
        stringList.toArray(strings);
        display(stringList);
        display(stringSet);
        display(stringMap.values());
        display(stringList.iterator());
        display(stringSet.iterator());
        display(stringMap.values().iterator());
    }
}
