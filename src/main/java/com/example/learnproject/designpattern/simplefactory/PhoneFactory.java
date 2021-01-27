package com.example.learnproject.designpattern.simplefactory;

/**
 * @author ：majingyu
 * @date ：Created in 2021/1/27 11:35
 * @description：
 * @modified By：
 */
public class PhoneFactory {
    public Phone makePhone(String type) {
        if ("mi".equals(type)) {
            return new MiPhone();
        } else if ("apple".equals(type)) {
            return new ApplePhone();
        } else {
            return null;
        }
    }
}