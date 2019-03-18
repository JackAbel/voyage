package cn.sohu.jack.thinking.java.chapter9interface;

/**
 * @author jinxianbao
 * @date 2019/3/18 8:47 PM
 */
public class Upcase extends Processor {
    @Override
    String process(Object input) {
        return ((String)input).toUpperCase();
    }
}
