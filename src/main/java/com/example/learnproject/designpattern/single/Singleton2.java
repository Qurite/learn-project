package com.example.learnproject.designpattern.single;

/**
 * @author ：majingyu
 * @date ：Created in 2021/1/27 14:43
 * @description：懒汉式，线程安全
 * @modified By：
 */
public class Singleton2 {
    private static Singleton2 singleton2;
    private Singleton2() {

    }

    public static synchronized Singleton2 getInstance() {
        if (singleton2 == null) {
            return new Singleton2();
        }
        return singleton2;
    }
}