package cn.sohu.jack.thinking.java.chapter4;

/**
 * @author jinxianbao
 * @date 2019/3/5 9:31 AM
 */
public class ListCharacters {
    public static void main(String[] args) {
        /*for (char i = 0; i < 128; i++) {
            if (Character.isLowerCase(i)) {
                System.out.println("value: " + (int)i + "  character: " + i);
            }
        }
        // print 1-100
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }*/
        // 25 random classify
        int i = 0;
        int j = intRandom();
        int k = 0;
        do {
            i++;
            k = intRandom();
            if (k == j) {
                System.out.println("randomNum: " + j + " = " + k);
            } else if (k < j) {
                System.out.println("randomNum: " + j + " > " + k);
            } else {
                System.out.println("randomNum: " + j + " < " + k);
            }
            j = k;
        } while (i < 25);

    }
    private static int intRandom() {
        int i = (int)Math.round(Math.random() * 100);
        return i;
    }

}
