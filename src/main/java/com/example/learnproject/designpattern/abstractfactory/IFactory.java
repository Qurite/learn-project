package com.example.learnproject.designpattern.abstractfactory;

/**
 * @author ：majingyu
 * @date ：Created in 2021/1/27 13:44
 * @description：
 * @modified By：
 */
public interface IFactory {
    IUser createUser();

    IType createType();
}