package com.example.learnproject.designpattern.factorymethod;

import com.example.learnproject.designpattern.simplefactory.ApplePhone;
import com.example.learnproject.designpattern.simplefactory.MiPhone;
import com.example.learnproject.designpattern.simplefactory.Phone;

/**
 * @author ：majingyu
 * @date ：Created in 2021/1/27 13:21
 * @description：
 * @modified By：
 */
public class AppleFactory implements AbstractFatoty {

    @Override
    public Phone makePhonr() {
        return new ApplePhone();
    }
}