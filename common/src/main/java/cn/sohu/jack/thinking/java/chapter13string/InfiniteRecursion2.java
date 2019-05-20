package cn.sohu.jack.thinking.java.chapter13string;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jinxianbao
 * @date 2019/5/14 9:12 AM
 */
public class InfiniteRecursion2 {
    public static void main(String[] args) {
        List<InfiniteRecursion> v = new ArrayList<InfiniteRecursion>();
        for (int i = 0; i < 10; i++) {
            v.add(new InfiniteRecursion());
        }
        System.out.println(v);
    }
}
