package cn.sohu.jack.thinking.java.chapter16array;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/7/1 9:16 AM
 */
public class ArrayOfGenerics {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        List<String>[] ls;
        List[] la = new List[10];
        ls = (List<String>[])la;
        ls[0] = new ArrayList<String>();
        Object[] objects = ls;
        objects[1] = new ArrayList<Integer>();

    }
}
