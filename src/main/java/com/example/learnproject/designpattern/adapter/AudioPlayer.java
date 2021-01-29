package com.example.learnproject.designpattern.adapter;

/**
 * @author ：majingyu
 * @date ：Created in 2021/1/29 14:03
 * @description：
 * @modified By：
 */
public class AudioPlayer implements MediaPlayer {

    MediaPlayer mediaPlayer;
    @Override
    public void play(String audioType, String fileName) {

        if ("mp3".equalsIgnoreCase(audioType)) {
            System.out.println("Playing mp3 file. Name: " + fileName);
        } else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
            mediaPlayer = new MediaAdapter(audioType);
            mediaPlayer.play(audioType, fileName);
        } else {
            System.out.println("Invalid media. " +
                    audioType + " format not supported");
        }
    }
}