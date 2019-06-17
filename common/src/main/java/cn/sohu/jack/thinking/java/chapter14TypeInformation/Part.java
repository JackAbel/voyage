package cn.sohu.jack.thinking.java.chapter14TypeInformation;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/6/2 9:56 PM
 */
public class Part {
    public String toString() {
        return getClass().getSimpleName();
    }

    static List<Factory<? extends Part>> partFactories = new ArrayList<>();
    static {

    }

    private static Random rand = new Random(146);

    public static Part createRandom() {
        int n = rand.nextInt(partFactories.size());
        return partFactories.get(n).create();
    }
}
