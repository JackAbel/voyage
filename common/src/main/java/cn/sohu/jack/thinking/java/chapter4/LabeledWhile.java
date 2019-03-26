package cn.sohu.jack.thinking.java.chapter4;

/**
 * @author jinxianbao
 * @date 2019/3/26 9:26 PM
 */
public class LabeledWhile {
    public static void main(String[] args) {
        int i = 0;
        // loop with label
        outer:
        while (true) {
            System.out.println("outer loop");
            while (true) {
                i++;
                if (i == 1) {
                    System.out.println("inner loop = " + i);
                }
                if (i == 2) {
                    System.out.println("inner loop = " + i);
                    continue;
                }
                if (i == 3) {
                    System.out.println("inner loop = " + i);
                    continue outer;
                }
                if (i == 4) {
                    System.out.println("inner loop = " + i);
                    break;
                }
                if (i == 5) {
                    System.out.println("inner loop = " + i);
                    break outer;
                }
            }
        }

    }
}
