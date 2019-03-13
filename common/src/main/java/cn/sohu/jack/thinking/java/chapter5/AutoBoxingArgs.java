package cn.sohu.jack.thinking.java.chapter5;

/**
 * @author jinxianbao
 * @date 2019/3/9 10:24 PM
 */
public class AutoBoxingArgs {
    /**
     * @Description 自动装箱和可变参数列表可以和谐共处
     * @param args
     */
    private static void f(Integer... args) {
        for (Integer i : args) {
            System.out.println("i = " + i);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        f(1,2,3,4);
        f(new Integer(1), new Integer(2));
        f(10, new Integer(11), 12);
    }
}
