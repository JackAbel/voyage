package cn.sohu.jack.thinking.java.chapter17deepcollection;

import java.util.*;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/7/8 3:38 PM
 */
public class Practice6Unsupport {
    static void test(String s, List<String> list) {
        System.out.println(" --- " + s + " --- ");
        Collection<String> c = list;
        Collection<String> subList = list.subList(1, 8);
        Collection<String> copySubList = new ArrayList<>(subList);
        try {
            c.retainAll(copySubList);
        } catch (Exception e) {
            System.out.println("retainAll(): " + e);
        }
        try {
            c.removeAll(copySubList);
        } catch (Exception e) {
            System.out.println("removeAll(): " + e);
        }
        try {
            c.clear();
        } catch (Exception e) {
            System.out.println("clear(): " + e);
        }
        try {
            c.add("X");
        } catch (Exception e) {
            System.out.println("add(): " + e);
        }
        try {
            c.addAll(copySubList);
        } catch (Exception e) {
            System.out.println("addAll(): " + e);
        }
        try {
            c.remove("C");
        } catch (Exception e) {
            System.out.println("remove(): " + e);
        }
        try {
            list.set(0, "X");
        } catch (Exception e) {
            System.out.println("List.set(): " + e);
        }
        // addtional optional list methods;

        try {
            list.add("we");
        } catch (Exception e) {
            System.out.println("list.add(): " + e);
        }
        try {
            list.retainAll(copySubList);
        } catch (Exception e) {
            System.out.println("list.retainAll(): " + e);
        }
        try {
            list.addAll(copySubList);
        } catch (Exception e) {
            System.out.println("list.addAll(): " + e);
        }
        try {
            list.remove("C");
        } catch (Exception e) {
            System.out.println("list.remove(): " + e);
        }
        try {
            list.removeAll(copySubList);
        } catch (Exception e) {
            System.out.println("list.removeAll(): " + e);
        }
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("A B C D E F G H I G K L".split(" "));
        test("modifiable Copy", new ArrayList<>(list));
        test("Arrays.asList", list);
        test("unmodifiableList", Collections.unmodifiableList(list));
    }

}
