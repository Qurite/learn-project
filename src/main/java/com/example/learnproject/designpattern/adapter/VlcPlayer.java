package com.example.learnproject.designpattern.adapter;

/**
 * @author ：majingyu
 * @date ：Created in 2021/1/29 11:28
 * @description：
 * @modified By：
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //do nothing
    }
}