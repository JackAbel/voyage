package cn.sohu.jack.datastructureandarithmatic;

/**
 * @description: leetcode 习题解析
 * @author: Xiangbao Jin
 * @since 2020/9/23 11:09 AM
 */
public class SolutionLeetCode {

    // 动态规划解决矩阵最大正方形的问题
    public static int maximalSquare(char[][] chart) {
        int maxside = 0;
        if (null == chart || chart.length == 0 || chart[0].length == 0) {
            return 0;
        }
        int rows = chart.length, columns = chart[0].length;
        int[][] dp = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (chart[i][j] == 1) {
                    if (i == 0 || j == 0) {
                        dp[i][j] = 1;
                    } else {
                        dp[i][j] = Math.min(Math.min(dp[i-1][j],dp[i][j-1]), dp[i-1][j-1]) +1;
                    }
                    maxside = Math.max(maxside,dp[i][j]);
                }
            }
        }
        int maxSquare = maxside * maxside;
        return maxSquare;
    }

    public static void main(String[] args) {
        // test1
        char[][] tmp01 = {{0,1,0,0,0},{1,1,1,1,0},{1,1,1,1,1},{1,1,1,1,1},{0,0,1,1,1}};
        System.out.println(maximalSquare(tmp01));
    }
}
