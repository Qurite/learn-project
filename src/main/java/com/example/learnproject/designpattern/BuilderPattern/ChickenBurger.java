package com.example.learnproject.designpattern.BuilderPattern;

/**
 * @author ：majingyu
 * @date ：Created in 2021/1/28 13:46
 * @description：鸡肉汉堡
 * @modified By：
 */
public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "chicken burger";
    }

    @Override
    public float price() {
        return 50f;
    }
}