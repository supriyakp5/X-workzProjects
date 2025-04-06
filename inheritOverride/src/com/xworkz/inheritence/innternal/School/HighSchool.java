package com.xworkz.inheritence.innternal.School;

public class HighSchool extends School{
    public HighSchool() {
        super();
        System.out.println("HighSchool constructor - child");
    }

    @Override
    public void teach() {
        System.out.println("Teaching advanced subjects - child");
    }

    @Override
    public void bellRing() {
        System.out.println("Bell rings for each period - child");
    }

    @Override
    public void open() {
        System.out.println("High school is now open - child");
    }

    @Override
    public void close() {
        System.out.println("High school is closed - child");
    }
}
