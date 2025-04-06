package com.xworkz.inheritence.innternal.Game;

public class Game {
    public Game() {
        System.out.println("Game constructor - parent");
    }

    public void play() {
        System.out.println("Playing game - parent");
    }

    public void getTitle() {
        System.out.println("Game title - parent");
    }

    public void getGenre() {
        System.out.println("Game genre - parent");
    }

    public void getPlatform() {
        System.out.println("Game platform - parent");
    }

    public void getReleaseYear() {
        System.out.println("Release year - parent");
    }
}

