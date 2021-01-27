package com.example.learnproject.designpattern.single;

/**
 * @author ：majingyu
 * @date ：Created in 2021/1/27 14:49
 * @description：double check +volatile
 * @modified By：
 */
public class Singleton4 {
    private static volatile Singleton4 singleton4=null;
    private Singleton4(){}

    public static Singleton4 getInstance() {
        if (singleton4 == null) {
            synchronized (Singleton4.class) {
                if (singleton4 == null) {
                    return new Singleton4();
                }
            }
        }
        return singleton4;
    }
}