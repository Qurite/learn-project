package com.example.learnproject.designpattern.BuilderPattern;

/**
 * @author ：majingyu
 * @date ：Created in 2021/1/28 10:28
 * @description：创建一个表示食物条目和食物包装的接口。
 * @modified By：
 */
public interface Item {
    public String name();

    Packing packing();

    float price();

}
