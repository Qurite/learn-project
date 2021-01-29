package com.example.learnproject.designpattern.BuilderPattern;

/**
 * @author ：majingyu
 * @date ：Created in 2021/1/28 13:47
 * @description：可口可乐
 * @modified By：
 */
public class Baishi extends ColdDrink {
    @Override
    public String name() {
        return "Baishi";
    }

    @Override
    public float price() {
        return 35.0f;
    }
}