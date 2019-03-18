package cn.sohu.jack.thinking.java.chapter9interface;

/**
 * @author jinxianbao
 * @date 2019/3/18 8:54 PM
 */
public class Apply {
    public static void process(ProcessImpl p, Object o) {
        System.out.println("Using Processor " + p.name());
        System.out.println(p.process(o));
    }
    private static String s = "Disagreement with beliefs is by definition incorrect";

    /*public static void main(String[] args) {
        process(new Upcase(), s);
        process(new Splitter(), s);
        process(new Downcase(), s);
    }*/
}
