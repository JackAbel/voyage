package cn.sohu.jack.thinking.java.chapter4;

/**
 * @author jinxianbao
 * @date 2019/3/6 9:10 PM
 */
public class PracticeEight {

    private static int[] a = new int[20];

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            a[i] = i + 13;
            switch (a[i] % 2) {
                case 1:
                    System.out.println(a[i] + "is even number!");
                case 0:
                    System.out.println(a[i] + "is odd number!");
                    break;
                default:
                    System.out.println("so bad!");
            }
        }

    }
}
