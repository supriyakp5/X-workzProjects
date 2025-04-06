package com.xworkz.inheritence.innternal.Media;

public class Movie extends Media{
    public Movie() {
        super();
        System.out.println("Movie constructor - child");
    }

    @Override
    public void play() {
        System.out.println("Playing movie - child");
    }

    @Override
    public void getTitle() {
        System.out.println("Movie title - child");
    }

    @Override
    public void getDuration() {
        System.out.println("Movie duration - child");
    }

    @Override
    public void getGenre() {
        System.out.println("Movie genre - child");
    }

    @Override
    public void getRating() {
        System.out.println("Movie rating - child");
    }
}
