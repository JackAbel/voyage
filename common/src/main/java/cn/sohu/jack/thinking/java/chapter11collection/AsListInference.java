package cn.sohu.jack.thinking.java.chapter11collection;

import java.util.Arrays;
import java.util.List;

/**
 * @author jinxianbao
 * @date 2019/4/12 9:40 PM
 */
public class AsListInference {
    public static void main(String[] args) {
        List<Snow> snows = Arrays.asList(new Slush(), new Powder(), new Crusty());
        List<Snow> snows2 = Arrays.asList(new Heavy(), new Light());

    }
}
