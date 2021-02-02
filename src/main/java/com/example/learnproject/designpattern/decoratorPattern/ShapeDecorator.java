package com.example.learnproject.designpattern.decoratorPattern;

/**
 * @author ：majingyu
 * @date ：Created in 2021/2/1 15:42
 * @description：
 * @modified By：
 */
public abstract class ShapeDecorator implements Shape{
    protected Shape decoratorShape;

    public ShapeDecorator(Shape decoratorShape) {
        this.decoratorShape = decoratorShape;
    }

    @Override
    public void draw() {
        decoratorShape.draw();
    }

}