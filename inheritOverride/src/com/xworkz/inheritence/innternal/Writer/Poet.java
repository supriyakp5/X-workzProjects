package com.xworkz.inheritence.innternal.Writer;

public class Poet extends Writer{
    public Poet() {
        super();
        System.out.println("Poet constructor - child");
    }

    @Override
    public void write() {
        System.out.println("Writing a poem - child");
    }

    @Override
    public void edit() {
        System.out.println("Editing verses - child");
    }

    @Override
    public void publish() {
        System.out.println("Publishing poetry - child");
    }

    @Override
    public void research() {
        System.out.println("Researching metaphors - child");
    }
}
