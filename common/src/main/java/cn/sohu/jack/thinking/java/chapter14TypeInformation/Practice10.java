package cn.sohu.jack.thinking.java.chapter14TypeInformation;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/5/28 9:34 PM
 */
public class Practice10 {
    public static void main(String[] args) {
        char[] c = new char[10];
        // c is object
        System.out.println("Superclass is char[] c : " + c.getClass().getSuperclass());
        System.out.println("char[] c is object : " + (c instanceof Object));
    }
}
