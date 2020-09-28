package cn.sohu.jack.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2020/9/2 8:45 AM
 */
public class FastFail {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i + "");
        }
        int i = 0;
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (i == 3) {
                list.remove(3);
                //list.add(11+""); // 引起fast-fail
            }
            System.out.println(iterator.next());
            i++;
        }
    }
}
