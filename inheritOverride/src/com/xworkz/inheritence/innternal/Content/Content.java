package com.xworkz.inheritence.innternal.Content;

public class Content {
    public Content() {
        System.out.println("Content constructor - parent");
    }

    public void write() {
        System.out.println("Writing content - parent");
    }

    public void edit() {
        System.out.println("Editing content - parent");
    }

    public void publish() {
        System.out.println("Publishing content - parent");
    }

    public void archive() {
        System.out.println("Archiving content - parent");
    }
}