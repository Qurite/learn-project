package com.example.learnproject.designpattern.adapter;

/**
 * @author ：majingyu
 * @date ：Created in 2021/1/29 11:20
 * @description：为媒体播放器和更高级的媒体播放器创建接口。
 * @modified By：
 */
public interface MediaPlayer {
    void play(String audioType, String fileName);
}

