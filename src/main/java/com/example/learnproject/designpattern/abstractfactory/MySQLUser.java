package com.example.learnproject.designpattern.abstractfactory;

/**
 * @author ：majingyu
 * @date ：Created in 2021/1/27 13:40
 * @description：
 * @modified By：
 */
public class MySQLUser implements IUser{
    @Override
    public void insert(User user) {
        System.out.println("mysql add user");
    }

    @Override
    public User getUser(int id) {
        System.out.println("mysql get user");
        return null;
    }
}