package com.example.learnproject.suanfa;

import java.util.HashMap;
import java.util.Map;

/**
 * 斐波那契数列，爬楼梯
 */
class FibSolution {
   static Map<Integer, Integer> cache = new HashMap<>();
    public static int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        int a, b;
        if (cache.containsKey(n - 1)) {
            a = cache.get(n - 1);
        } else {
            a = climbStairs(n - 1);
            cache.put(n - 1, a);
        }
        if (cache.containsKey(n - 2)) {
            b = cache.get(n - 2);
        } else {
            b = climbStairs(n - 2);
            cache.put(n - 2, b);
        }
        return a + b;
    }

    /**
     * 记忆化递归
     * @return
     */
    public static int climbStairs1(int n) {
        int[] memo = new int[n + 1];
        return climbStairsMemo(n, memo);
    }

    private static int climbStairsMemo(int n, int[] memo) {
        if (memo[n] > 0) {
            return memo[n];
        }
        if (n == 1) {
            memo[n] = 1;
        } else if (n == 2) {
            memo[n] = 2;
        } else {
            memo[n] = climbStairsMemo(n - 1, memo) + climbStairsMemo(n - 2, memo);
        }
        return memo[n];
    }

    /**
     * 动态规划
     * @param n
     * @return
     */
    public static int climbStairs2(int n) {
        if(n<=2){
            return n;
        }
        int a = 1;
        int b = 2;
        for (int i = 3; i <=n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    public static void main(String[] args) {
        System.out.println(climbStairs2(3));


    }
    public  int fib(int n) {
        int[] memo = new int[n + 1];
        return fibMemo(n, memo);
    }
    public static int fibMemo(int n, int[] memo) {
        if (n <= 1) {
            return n;
        }
        if (memo[n] > 0) {
            return memo[n];
        } else {
            memo[n] = fibMemo(n - 1, memo) + fibMemo(n - 2, memo);
        }
        return memo[n];
    }



}