package com.ahmetvatansever;

public class BitrateReader {
    public static VideoFile read(VideoFile file, Codec code){
        System.out.println("Bitrate Reader : reading file");
        return file;
    }

    public static VideoFile convert(VideoFile buffer, Codec codec){
        System.out.println("BitrateReader : wrting file");
        return buffer;
    }
}
