package cn.sohu.jack.datastructureandarithmatic;

import java.util.*;

/**
 * @description: 由数组构成的栈
 * @author: Xiangbao Jin
 * @since 2020/9/14 7:35 PM
 */
public class StackArray {


    public static void main(String[] args) {
        Node node = new Node();
        Node node1 = new Node(1, node);
        Node node2 = node1;
        String s = "12";
        String s2 = "12";
        System.out.println(node1.equals(node2));
        System.out.println(s.equals(s2));
    }
}
