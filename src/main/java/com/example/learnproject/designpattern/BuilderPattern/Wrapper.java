package com.example.learnproject.designpattern.BuilderPattern;

/**
 * @author ：majingyu
 * @date ：Created in 2021/1/28 10:31
 * @description：创建实现 Packing 接口的实体类。纸盒
 * @modified By：
 */
public class Wrapper implements Packing {
    @Override
    public String pack() {
        return "wrapper";
    }
}