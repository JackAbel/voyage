package cn.sohu.jack.thinking.java.chapter17deepcollection;

import java.util.HashMap;
import java.util.Map;

/**
 * @description: 关联数组
 * @author: Xiangbao Jin
 * @since 2019/7/15 7:20 PM
 */
public class AssociativeArray<K, V> {
    private Object[][] pairs;
    private int index;

    public AssociativeArray(int length) {
        pairs = new Object[length][2];
    }

    public void put(K key, V value) {
        if (index >= pairs.length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        pairs[index++] = new Object[]{key, value};
    }

    @SuppressWarnings("unchecked")
    public V get(K key) {
        for (int i = 0; i < index; i++) {
            if (key.equals(pairs[i][0])) {
                return (V)pairs[i][1];
            }
        }
        return null;
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < index; i++) {
            result.append(pairs[i][0].toString())
                    .append(" : ").append(pairs[i][1].toString());
            if (i < index - 1) {
                result.append("\n");
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        AssociativeArray<String, String> test2 = new AssociativeArray<>(6);
        test2.put("sky", "blue");
        test2.put("grass", "green");
        test2.put("ocean", "dancing");
        test2.put("tree", "tall");
        test2.put("earth", "brown");
        test2.put("sun", "warm");

        try {
            test2.put("extra", "object");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.print("too many objects! ");
        }
        System.out.println(test2);
        System.out.println(test2.get("ocean"));
        Map<String, String> test = new HashMap<>(12);
    }
}
