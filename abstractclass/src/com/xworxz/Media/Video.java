package com.xworxz.Media;

public class Video {
    public class Video extends Audio {
        public Video(int duration, String format, boolean isPlaying) {
            super(duration, format, isPlaying);
        }

        public void display() {
            System.out.println("the audio has to:" + duration + "," + format + "," + isPlaying);
        }

    }
}

