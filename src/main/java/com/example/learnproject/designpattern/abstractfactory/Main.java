package com.example.learnproject.designpattern.abstractfactory;

/**
 * @author ：majingyu
 * @date ：Created in 2021/1/27 13:47
 * @description：
 * @modified By：
 */
public class Main {

    public static void main(String[] args) {
        User user = new User();
        Type type = new Type();
        IFactory factory = new MysqlFactory();
        IUser iUser = factory.createUser();
        iUser.insert(user);
        iUser.getUser(1);
        IType iType = factory.createType();
        iType.insert(type);
        iType.getType(1);
    }
}