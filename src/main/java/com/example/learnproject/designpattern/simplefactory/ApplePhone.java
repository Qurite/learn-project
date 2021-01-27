package com.example.learnproject.designpattern.simplefactory;

/**
 * @author ：majingyu
 * @date ：Created in 2021/1/27 11:33
 * @description：
 * @modified By：
 */
public class ApplePhone implements Phone {
    public ApplePhone() {
        this.makePhone();
    }

    @Override
    public void makePhone() {
        System.out.println("制作苹果手机");
    }
}