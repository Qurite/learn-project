package com.example.learnproject.designpattern.single;

/**
 * @author ：majingyu
 * @date ：Created in 2021/1/27 14:47
 * @description：饿汉式
 * @modified By：
 */
public class Singleton3 {
    private static Singleton3 singleton3 = new Singleton3();
    private Singleton3() {}

    public static Singleton3 getInstance() {
        return singleton3;         
    }
}