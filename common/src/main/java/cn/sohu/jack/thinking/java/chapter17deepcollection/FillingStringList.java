package cn.sohu.jack.thinking.java.chapter17deepcollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/7/4 5:59 PM
 */
public class FillingStringList {
    public static void main(String[] args) {
        List<StringBuild> lists = new ArrayList<>(Collections.nCopies(4, new StringBuild("Hello")));
        System.out.println(lists);
        Collections.fill(lists, new StringBuild("world!"));
        System.out.println(lists);
    }
}
