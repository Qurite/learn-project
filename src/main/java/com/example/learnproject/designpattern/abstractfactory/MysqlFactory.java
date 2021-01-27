package com.example.learnproject.designpattern.abstractfactory;


/**
 * @author ：majingyu
 * @date ：Created in 2021/1/27 13:45
 * @description：
 * @modified By：
 */
public class MysqlFactory implements IFactory {
    @Override
    public IUser createUser() {
        return new MySQLUser();
    }

    @Override
    public IType createType() {
        return new MySQLType();
    }
}