package cn.sohu.jack.thinking.java.chapter11collection;

import java.util.*;

/**
 * @author jinxianbao
 * @date 2019/4/12 9:46 PM
 */
public class PrintingContainers {
    static Collection fill(Collection<String> collection) {
        collection.add("dad");
        collection.add("amateur");
        collection.add("mom");
        return collection;
    }

    static Map fill(Map<String, String> map) {
        map.put("dad", "li");
        map.put("amateur", "lover");
        map.put("rat", "mouse");
        return map;
    }

    public static void main(String[] args) {
        System.out.println(fill(new LinkedList<>()));
        System.out.println(fill(new ArrayList<>()));
        System.out.println(fill(new HashSet<>()));
        System.out.println(fill(new TreeSet<>()));
        System.out.println(fill(new LinkedHashSet<>()));
        System.out.println(fill(new HashMap<>()));
        System.out.println(fill(new TreeMap<>()));
        System.out.println(fill(new LinkedHashMap<>()));
    }
}
