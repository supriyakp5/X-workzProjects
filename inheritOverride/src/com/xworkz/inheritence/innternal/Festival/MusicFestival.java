package com.xworkz.inheritence.innternal.Festival;

public class MusicFestival extends Festival{

    public MusicFestival() {
        super();
        System.out.println("MusicFestival constructor - child");
    }

    @Override
    public void plan() {
        System.out.println("Planning music festival lineup - child");
    }

    @Override
    public void promote() {
        System.out.println("Promoting music festival on social media - child");
    }

    @Override
    public void organize() {
        System.out.println("Organizing music performances - child");
    }

    @Override
    public void conclude() {
        System.out.println("Music festival ended with fireworks - child");
    }
}
