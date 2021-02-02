package com.example.learnproject.designpattern.decoratorPattern;

/**
 * @author ：majingyu
 * @date ：Created in 2021/2/1 17:55
 * @description：
 * @modified By：
 */
public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape decoratorShape) {
        super(decoratorShape);
    }

    public void draw() {
        decoratorShape.draw();
        setRedBorder(decoratorShape);

    }
    private void setRedBorder(Shape decoratorShape) {
        System.out.println("Border Color: Red");
    }
}