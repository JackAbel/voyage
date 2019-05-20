package cn.sohu.jack.thinking.java.chapter13string;

/**
 * @author jinxianbao
 * @date 2019/5/17 7:56 PM
 */
public class IntegerMatch {
    public static void main(String[] args) {
        System.out.println("-1".matches("-?\\d"));
        System.out.println("+912".matches("(-|\\+)?\\d+"));
        System.out.println("z".matches("zo*"));
        System.out.println("does".matches("do(es)?"));
    }
}
