package cn.sohu.jack.thinking.java.chapter11collection;

import java.util.*;

/**
 * @author jinxianbao
 * @date 2019/4/16 10:54 AM
 */
public class Statistics {
    public static void main(String[] args) {
        Random rand = new Random(49);
        Map<Integer, Integer> intMap = new HashMap<>();
        for (int i = 0; i < 10000; i++) {
            int r = rand.nextInt(20);
            Integer freq = intMap.get(r);
            intMap.put(r, freq == null ? 1 : freq + 1);
        }
        Iterator<Integer> test = intMap.values().iterator();
        int max = 0;
        while (test.hasNext()) {
            if (max < test.next()) {
                max = test.next();
            }
        }
        for (Integer i : intMap.keySet())
            if (intMap.get(i).equals(max)) {
                System.out.println(i + " = " + max);
            }
    }
    public void main() {
        Random rand = new Random(49);
        Map<Integer, Integer> intMap = new HashMap<>();
        for (int i = 0; i < 10000; i++) {
            int r = rand.nextInt(20);
            Integer freq = intMap.get(r);
            intMap.put(r, freq == null ? 1 : freq + 1);
        }
        Iterator<Integer> test = intMap.values().iterator();
        int max = 0;
        while (test.hasNext()) {
            if (max < test.next()) {
                max = test.next();
            }
        }
        for (Integer i : intMap.keySet())
            if (intMap.get(i).equals(max)) {
                System.out.println(i + " = " + max);
            }
    }
}
