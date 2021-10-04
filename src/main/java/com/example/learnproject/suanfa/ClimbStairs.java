package com.example.learnproject.suanfa;


/**
 * @author ：majingyu
 * @date ：Created in 2021/9/24 20:26
 * @description：
 * @modified By：
 */
public class ClimbStairs {
    public static int climbStairs(int n) {
        if (n <= 1) {
            return n;
        }
        int a = 1, b = 2;
        for (int i = 3; i <=n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    /**
     * 记忆化递归
     * @param n
     * @return
     */
    public static int climbStairs1(int n) {
        int[] memo = new int[n + 1];
        return f(n, memo);
    }

    private static int f(int n, int[] memo) {
        if (memo[n] > 0) {
            return memo[n];
        }
        if (n <= 2) {
            memo[n] = n;
            return memo[n];
        } else {
            memo[n] = f(n - 1, memo) + f(n - 2, memo);
        }
        return memo[n];
    }


    public static void main(String[] args) {
        System.out.println(climbStairs(8));
        System.out.println(climbStairs1(8));
    }

    //记忆化递归
    public int climbStairs2(int n) {
        int[] memo=new int[n+1];
        return memoStair(n,memo);
    }
    private int memoStair(int n,int[] memo)
    {
        if(memo[n]>0){
            return memo[n];
        }
        if(n<=2){
            memo[n]=n;
        }else{
            memo[n]=memoStair(n-1,memo)+memoStair(n-2,memo);}
        return memo[n];
    }

}