package com.xworkz.inheritence.innternal.Music;

public class ClassicalMusic extends Music{
    public ClassicalMusic() {
        super();
        System.out.println("ClassicalMusic constructor - child");
    }

    @Override
    public void play() {
        System.out.println("Playing classical raga - child");
    }

    @Override
    public void getGenre() {
        System.out.println("Genre: Classical - child");
    }

    @Override
    public void getDuration() {
        System.out.println("Duration: 45 minutes - child");
    }

    @Override
    public void getArtist() {
        System.out.println("Artist: Ravi Shankar - child");
    }

    @Override
    public void getLanguage() {
        System.out.println("Instrumental - child");
    }
}
