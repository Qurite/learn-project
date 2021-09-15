package com.example.learnproject.suanfa;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ：majingyu
 * @date ：Created in 2021/9/10 20:40
 * @description：
 * @modified By：
 */
public class FibTest {

    public static void main(String[] args) {
        System.out.println(fib(5));
    }

    private static Map<Integer, Integer> fibnCache = new HashMap<>();

    private static int fib(int n) {

        if (n < 2) {
            return  n;
        }
        int a, b;
        if (fibnCache.containsKey(n-1)) {
            a = fibnCache.get(n);
        } else {
            a = fib(n - 1);
        }
        if (fibnCache.containsKey(n-2)) {
            b = fibnCache.get(n);
        } else {
            b = fib(n - 2);
        }

        return a + b;
    }
}