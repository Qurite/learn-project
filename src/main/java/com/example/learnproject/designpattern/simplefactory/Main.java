package com.example.learnproject.designpattern.simplefactory;

/**
 * @author ：majingyu
 * @date ：Created in 2021/1/27 11:37
 * @description：
 * @modified By：
 */
public class Main {

    public static void main(String[] args) {
        PhoneFactory phoneFactory = new PhoneFactory();
        Phone mi = phoneFactory.makePhone("mi");
        ApplePhone applePhone = (ApplePhone) phoneFactory.makePhone("apple");

    }
}