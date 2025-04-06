package com.xworkz.inheritence.innternal.Game;

public class GameRunner {
    public static void main(String[] args)
    {
        Game g1 = new Game();
        g1.play();
        g1.getTitle();
        g1.getGenre();
        g1.getPlatform();
        g1.getReleaseYear();

        System.out.println("-----");

        Game g2 = new VideoGame();
        g2.play();
        g2.getTitle();
        g2.getGenre();
        g2.getPlatform();
        g2.getReleaseYear();

        System.out.println("-----");

        VideoGame g3 = new VideoGame();
        g3.play();
        g3.getTitle();
        g3.getGenre();
        g3.getPlatform();
        g3.getReleaseYear();
    }
}
