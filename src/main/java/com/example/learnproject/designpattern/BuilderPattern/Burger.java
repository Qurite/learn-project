package com.example.learnproject.designpattern.BuilderPattern;

/**
 * @author ：majingyu
 * @date ：Created in 2021/1/28 10:35
 * @description：汉堡
 * @modified By：
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();

}