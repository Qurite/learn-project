package com.example.learnproject.designpattern.abstractfactory;

/**
 * @author ：majingyu
 * @date ：Created in 2021/1/27 13:39
 * @description：
 * @modified By：
 */
public interface IUser {
    void insert(User user);

    User getUser(int id);
}