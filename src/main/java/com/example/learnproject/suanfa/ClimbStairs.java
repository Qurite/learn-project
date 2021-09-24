package com.example.learnproject.suanfa;


/**
 * @author ：majingyu
 * @date ：Created in 2021/9/24 20:26
 * @description：
 * @modified By：
 */
public class ClimbStairs {
    public static int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }

        int a = 1, b = 2;
        int c = 0;
        for (int i = 3; i <=n; i++) {
            c = a + b;
            a = b;
            b = c;

        }
        return b;
    }


    public static void main(String[] args) {
        System.out.println(climbStairs(3));
    }
}