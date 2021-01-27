package com.example.learnproject.designpattern.single;

/**
 * @author ：majingyu
 * @date ：Created in 2021/1/27 15:01
 * @description：
 * @modified By：
 */
public class Singleton5 {
    private static class SingletonHolder {
        private static final Singleton5 SINGLETON_5 = new Singleton5();

    }
    private Singleton5() {}

    public static Singleton5 getInstance() {
        return SingletonHolder.SINGLETON_5;
    }
}