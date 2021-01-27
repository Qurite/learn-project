package com.example.learnproject.designpattern.Proxy;

/**
 * @author ：majingyu
 * @date ：Created in 2021/1/27 15:43
 * @description：
 * @modified By：
 */
public class ProxyImage implements Image {

    private RealImage realImage;

    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}