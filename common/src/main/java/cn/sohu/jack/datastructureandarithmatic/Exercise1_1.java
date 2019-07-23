package cn.sohu.jack.datastructureandarithmatic;

/**
 * @description: selection problem
 * @author: Xiangbao Jin
 * @since 2019/7/19 2:45 PM
 */
public class Exercise1_1 {
    public static void main(String[] args) throws Exception {
        int[] sg = {12, 13, 9};

        System.out.println(selectOfArrys(sg));

    }

    private static int selectOfArrys(int[] ints) throws Exception {
        if (ints.length == 0) {
            throw new Exception("parameter is null");
        } else {
            int i = ints.length / 2;
            int tmp = 0;
            for (int j = 0; j < ints.length; j++) {
                tmp = ints[j];
                for (int h = j + 1; h < ints.length; h++) {
                    if (ints[j] > ints[h]) {
                        ints[j] = ints[h];
                        ints[h] = tmp;
                        tmp = ints[j];
                    }
                }
            }
            return ints[i];
        }

    }
}
