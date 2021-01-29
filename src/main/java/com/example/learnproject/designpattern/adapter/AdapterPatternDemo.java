package com.example.learnproject.designpattern.adapter;

/**
 * @author ：majingyu
 * @date ：Created in 2021/1/29 14:06
 * @description：
 * @modified By：
 */
public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "123.mp3");
        audioPlayer.play("mp4", "456.mp4");
        audioPlayer.play("vlc", "789.vlc");
        audioPlayer.play("avi", "666.avi");
    }
}