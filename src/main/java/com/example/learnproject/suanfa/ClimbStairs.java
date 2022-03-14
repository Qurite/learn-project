package com.example.learnproject.suanfa;


import java.math.BigDecimal;
import java.math.RoundingMode;

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
        long applyRefundAmount = 7l;
        long paidAmount = 21l;
        BigDecimal bonusPoint = new BigDecimal(20.0);
        System.out.println(new BigDecimal(applyRefundAmount));
        System.out.println(new BigDecimal(paidAmount));
        System.out.println(new BigDecimal(applyRefundAmount)
                .divide(new BigDecimal(paidAmount),2,BigDecimal.ROUND_HALF_UP));
        BigDecimal bucklePointPoint = new BigDecimal(applyRefundAmount)
                .divide(new BigDecimal(paidAmount),2,BigDecimal.ROUND_HALF_UP)
                //*订单子单奖励积分值
                .multiply(bonusPoint).setScale(0, RoundingMode.DOWN);
        System.out.println(bucklePointPoint);
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