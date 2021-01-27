package com.example.learnproject.designpattern.Proxy;

/**
 * @author ：majingyu
 * @date ：Created in 2021/1/27 15:53
 * @description：
 * @modified By：
 */
public class Main {
    public static void main(String[] args) {
        Image image = new ProxyImage("test.png");
        image.display();
        System.out.println("");

        //图像将无法从磁盘加载
        image.display();
    }
}