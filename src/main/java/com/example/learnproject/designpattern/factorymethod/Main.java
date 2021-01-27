package com.example.learnproject.designpattern.factorymethod;

/**
 * @author ：majingyu
 * @date ：Created in 2021/1/27 13:22
 * @description：
 * @modified By：
 */
public class Main {
    public static void main(String[] args) {
        AbstractFatoty miFatoty = new MiFactory();
        AbstractFatoty appleFctory = new AppleFactory();
        miFatoty.makePhonr();
        appleFctory.makePhonr();
    }
}