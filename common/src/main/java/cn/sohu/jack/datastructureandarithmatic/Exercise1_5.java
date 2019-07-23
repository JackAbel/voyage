package cn.sohu.jack.datastructureandarithmatic;

/**
 * @description:
 * @author: Xiangbao Jin
 * @since 2019/7/19 5:39 PM
 */
public class Exercise1_5 {
    private static int binaryPrint(int n) {
        if (n < 2) {
            return n;
        }
        return n % 2 + binaryPrint(n/2);
    }

    public static void main(String[] args) {
        System.out.println(binaryPrint(256));
        //binaryPrint(255);
    }
}
