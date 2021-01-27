package com.example.learnproject.designpattern.Proxy;

/**
 * @author ：majingyu
 * @date ：Created in 2021/1/27 15:42
 * @description：
 * @modified By：
 */
public class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;

        System.out.println("loading......" + fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }
}