package com.xworkz.inheritence.innternal.Artist;

public class FilmArtist {

    public void Actor(Artist artist){
        artist.study();
        artist.earn();
        artist.create();
        artist.display();

        if(artist instanceof Painter)
        {
            System.out.println("artist instance of painter");
            Painter painter=(Painter) artist;
            painter.newPaint();
        }
    }

}
