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
        int[][] dep = new int[m][n];
        for (int i = 0; i < m; i++) {
            dep[i][0] = 1;
        }
        for (int i = 0; i < n; i++) {
            dep[0][i] = 1;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dep[i][j] = dep[i - 1][j] + dep[i][j - 1];
            }
        }
        return dep[m - 1][n - 1];
    }

        public int uniquePaths1(int m, int n) {
            int[][] dep=new int[m][n];
            for(int i=1;i<=m;i++){
                dep[i][1]=1;
            }
            for(int j=1;j<=n;j++){
                dep[1][j]=1;
            }
            for(int i=2;i<=m;i++){
                for(int j=2;j<=n;j++){
                    dep[i][j]=dep[i-1][j]+dep[i][j-1];
                }
            }
            return dep[m][n];

        }


    /**
     * 记忆化递归
     * @param m
     * @param n
     * @return
     */
    public static int uniquePathsMemo(int m, int n) {
        // TODO: 2021/9/25  
        int[][] dep = new int[m][n];
        for (int i = 0; i < m; i++) {
            dep[i][0] = 1;
        }
        for (int i = 0; i < n; i++) {
            dep[0][i] = 1;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dep[i][j] = dep[i - 1][j] + dep[i][j - 1];
            }
        }
        return dep[m - 1][n - 1];
    }

    public static void main(String[] args) {
        System.out.println(uniquePaths(7, 3));
    }
}