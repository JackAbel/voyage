package cn.sohu.jack.datastructureandarithmatic;

/**
 * @description: 递归实现查找数组中的最大次大值
 * @author: Xiangbao Jin
 * @since 2019/11/17 7:34 PM
 */
public class MaxNumberRecursion {
    private static void max2(int[] A, int lo, int hi, int[] B) {

        if (lo + 1 == hi) {
            if (A[lo] >= A[hi]) {
                B[0] = A[lo];
                B[1] = A[hi];
            } else {
                B[0] = A[hi];
                B[1] = A[lo];
            }
            return;
        }
        if (lo + 2 == hi) {
            if (A[lo] >= A[lo + 1]) {
                if (A[lo + 1] >= A[hi]) {
                    B[0] = A[lo];
                    B[1] = A[lo + 1];
                } else if (A[hi] >= A[lo]) {
                    B[0] = A[hi];
                    B[1] = A[lo];
                } else if (A[hi] < A[lo]) {
                    B[0] = A[lo];
                    B[1] = A[hi];
                }
            } else {
                if (A[lo] >= A[hi]) {
                    B[0] = A[lo+1];
                    B[1] = A[lo];
                } else if (A[hi] >= A[lo+1]) {
                    B[0] = A[hi];
                    B[1] = A[lo+1];
                } else if (A[hi] < A[lo+1]) {
                    B[0] = A[lo+1];
                    B[1] = A[hi];
                }

            }
            return;
        }
        int mi = (lo + hi) /2;
        int[] tmpLeft = new int[2];
        int[] tmpRight = new int[2];
        max2(A, lo, mi, tmpLeft);
        max2(A, mi+1, hi, tmpRight);
        if (tmpLeft[0] >= tmpRight[0]) {
            B[0] = tmpLeft[0];
            B[1] = tmpLeft[1] >= tmpRight[0] ? tmpLeft[1] : tmpRight[0];
        } else {
            B[0] = tmpRight[0];
            B[1] = tmpRight[1] >= tmpLeft[0] ? tmpRight[1] : tmpLeft[0];
        }
        System.out.println(B[0] + "-----" + B[1]);
    }

    public static void main(String[] args) {
        int[] A = {10, 2, 3, 5, 8};
        int[] B = {0,0};
        max2(A, 0, 4, B);
    }
}
