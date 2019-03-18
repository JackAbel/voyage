package cn.sohu.jack.thinking.java.chapter9interface;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author jinxianbao
 * @date 2019/3/18 8:47 PM
 */
public class Splitter extends Processor {
    @Override
    String process(Object input) {
        return Arrays.toString(((String) input).split(" "));
    }
}
