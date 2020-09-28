package cn.sohu.jack.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @description: list 的4种迭代方式
 * @author: Xiangbao Jin
 * @since 2020/9/2 2:07 PM
 */
public class ListIterator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("jack");
        list.add("jackKing");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        for (String s : list) {
            System.out.println(s);
        }
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        list.forEach(System.out::println);
        list.stream().forEach(System.out::println);

        List<String> list2 = new CopyOnWriteArrayList<String>() {{add("liming");add("ming");}};
        list2.iterator();
        for (String s : list2) {
            if ("ming".equals(s)) {
                list2.remove("ming");
            }
        }
        System.out.println(list2);
    }


}
