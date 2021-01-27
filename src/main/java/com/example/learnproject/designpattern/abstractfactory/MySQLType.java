package com.example.learnproject.designpattern.abstractfactory;

/**
 * @author ：majingyu
 * @date ：Created in 2021/1/27 13:40
 * @description：
 * @modified By：
 */
public class MySQLType implements IType{
    @Override
    public void insert(Type type) {
        System.out.println("mysql add type");
    }

    @Override
    public User getType(int id) {
        System.out.println("mysql get type");
        return null;
    }
}