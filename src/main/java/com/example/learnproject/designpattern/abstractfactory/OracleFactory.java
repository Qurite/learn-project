package com.example.learnproject.designpattern.abstractfactory;

/**
 * @author ：majingyu
 * @date ：Created in 2021/1/27 13:46
 * @description：
 * @modified By：
 */
public class OracleFactory implements IFactory {
    @Override
    public IUser createUser() {
        return new OracleUser();
    }

    @Override
    public IType createType() {
        return new OracleType();
    }
}