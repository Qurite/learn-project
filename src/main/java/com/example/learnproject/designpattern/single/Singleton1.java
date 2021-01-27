package com.example.learnproject.designpattern.single;

/**
 * @author ：majingyu
 * @date ：Created in 2021/1/27 14:39
 * @description：懒汉式，线程不安全
 * @modified By：
 */
public class Singleton1 {
    private static Singleton1 singleton1;
    private Singleton1(){}

    public static Singleton1 getInstance() {
        if (singleton1 == null) {
            singleton1 = new Singleton1();
        }
        return singleton1;
    }
}