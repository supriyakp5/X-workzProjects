package com.xworkz.inheritence.innternal.Artist;

public class ArtistRunner {
    public static void main(String[] args) {
        Artist artist = new Artist();
        artist.create();
        artist.display();
        artist.earn();
        artist.study();

        System.out.println("-----");

        Artist artist1 = new Painter();
        artist1.create();
        artist1.display();
        artist1.earn();
        artist1.study();

        System.out.println("-----");

        Painter painter = new Painter();
        painter.create();
        painter.display();
        painter.earn();
        painter.study();



        System.out.println("________________casting_________");
        FilmArtist filmArtist=new FilmArtist();
        filmArtist.Actor(painter);
        filmArtist.Actor(artist);
        filmArtist.Actor(artist1);

    }
}
