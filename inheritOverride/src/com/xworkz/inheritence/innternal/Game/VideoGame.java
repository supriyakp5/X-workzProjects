package com.xworkz.inheritence.innternal.Game;

class VideoGame extends Game {
    public VideoGame() {
        super();
        System.out.println("VideoGame constructor - child");
    }

    @Override
    public void play() {
        System.out.println("Playing video game - child");
    }

    @Override
    public void getTitle() {
        System.out.println("Video game title - child");
    }

    @Override
    public void getGenre() {
        System.out.println("Video game genre - child");
    }

    @Override
    public void getPlatform() {
        System.out.println("Video game platform - child");
    }

    @Override
    public void getReleaseYear() {
        System.out.println("Video game release year - child");
    }
}
