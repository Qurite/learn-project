package com.example.learnproject.designpattern.BuilderPattern;

/**
 * @author ：majingyu
 * @date ：Created in 2021/1/28 10:31
 * @description：瓶子
 * @modified By：
 */
public class Bottle implements Packing {
    @Override
    public String pack() {
        return "bottle";
    }

}