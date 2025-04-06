package com.xworkz.inheritence.innternal.Content;

public class BlogPost extends Content{
    public BlogPost() {
        super();
        System.out.println("BlogPost constructor - child");
    }

    @Override
    public void write() {
        System.out.println("Writing blog post - child");
    }

    @Override
    public void edit() {
        System.out.println("Editing blog post - child");
    }

    @Override
    public void publish() {
        System.out.println("Publishing blog post - child");
    }

    @Override
    public void archive() {
        System.out.println("Archiving blog post - child");
    }
}
