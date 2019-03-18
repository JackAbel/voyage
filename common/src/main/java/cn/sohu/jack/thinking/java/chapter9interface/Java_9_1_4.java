package cn.sohu.jack.thinking.java.chapter9interface;

/**
 * @author jinxianbao
 * @date 2019/3/18 10:01 AM
 */
public class Java_9_1_4 {
    public static void testPrint(AbstractOne oneAbstract) {
        ((OneExtend)oneAbstract).print();
    }

    public static void main(String[] args) {
        Java_9_1_4.testPrint(new OneExtend());
    }
}
