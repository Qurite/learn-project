package com.example.learnproject.designpattern.adapter;

/**
 * @author ：majingyu
 * @date ：Created in 2021/1/29 11:29
 * @description：
 * @modified By：
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        //do nothing
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: " + fileName);
    }
}