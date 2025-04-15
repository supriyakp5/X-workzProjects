package com.xworxz.Media;

public class Audio {
    public abstract class Audio {
        int duration;
        String format;
        boolean isPlaying;

        public Audio(int duration, String format, boolean isPlaying) {
            this.duration = duration;
            this.format = format;
            this.isPlaying = isPlaying;

        }

    }
}