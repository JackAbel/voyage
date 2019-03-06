package cn.sohu.jack.thinking.java.chapter4;

/**
 * @author jinxianbao
 * @date 2019/3/6 9:23 PM
 */
public class Fibonacci {
    private static void fibonacci(int num) {
        int a1 = 1;
        int tmp = 0;
        int a2 = 1;
        for (int i = 0; i < num; i++) {
            if (i == 0 || i == 1) {
                System.out.println(a1);
            } else {

                tmp = a1 + a2;
                a1 = a2;
                a2 = tmp;
                System.out.println(tmp);
            }
        }
    }

    public static void main(String[] args) {
        fibonacci(8);
    }

}
