package com.ahmetvatansever;

public class CodecFactory {
    public static Codec extract(VideoFile file){
        String type = file.getCodecType();
        if (type.equals("mp4")) {
            System.out.println("Codec Factory: extracting MP4 audio...");
            return new MP4CompressionCodec();
        }
        else{
            System.out.println("Codec Factory: extacting OGG audio...");
            return new OggCompressionCodec();
        }
    }
}
