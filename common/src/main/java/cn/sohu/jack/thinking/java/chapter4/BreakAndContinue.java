package cn.sohu.jack.thinking.java.chapter4;

/**
 * @author jinxianbao
 * @date 2019/3/6 9:55 AM
 */
public class BreakAndContinue {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            if (i == 74) {
                break;
            }
            if (i % 9 != 0) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();
        // using while
        int i = 0;
        while (true) {
            i++;
            int y = i * 27;
            if (y == 1269) {
                break;
            }
            if (i % 10 != 0) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();
        for (int j = 1; j < 200; j++) {
            if (j % 9 != 0) {
                continue;
            }
            System.out.print(j + " ");
            if (j == 99) {
                //break;
                return;
            }
        }

    }
}
