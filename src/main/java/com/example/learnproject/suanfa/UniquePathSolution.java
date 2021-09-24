package com.example.learnproject.suanfa;


/**
 * 不同路径
 */
class UniquePathSolution {

    /**
     * 动态规划
     * @param m
     * @param n
     * @return
     */
    public static int uniquePaths(int m, int n) {
        int[][] dept = new int[m][n];
        for (int i = 0; i < m; i++) {
            dept[i][0] = 1;
        }
        for (int i = 0; i < n; i++) {
            dept[0][i] = 1;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dept[i][j] = dept[i][j - 1] + dept[i - 1][j];
            }
        }
        return dept[m - 1][n - 1];
    }

    public static void main(String[] args) {
        System.out.println(uniquePaths(7, 3));
    }
}