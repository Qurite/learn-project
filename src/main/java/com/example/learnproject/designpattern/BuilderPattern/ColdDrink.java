package com.example.learnproject.designpattern.BuilderPattern;

/**
 * @author ：majingyu
 * @date ：Created in 2021/1/28 13:35
 * @description：
 * @modified By：
 */
public abstract  class ColdDrink implements Item{
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}