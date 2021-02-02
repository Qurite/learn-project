package com.example.learnproject.designpattern.decoratorPattern;

/**
 * @author ：majingyu
 * @date ：Created in 2021/2/1 15:41
 * @description：
 * @modified By：
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}