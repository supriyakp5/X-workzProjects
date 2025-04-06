package com.xworkz.inheritence.innternal.Document;

public class Document {
    public Document() {
        System.out.println("Document constructor - parent");
    }

    public void open() {
        System.out.println("Document opened - parent");
    }

    public void close() {
        System.out.println("Document closed - parent");
    }

    public void print() {
        System.out.println("Document printed - parent");
    }

    public void save() {
        System.out.println("Document saved - parent");
    }

    public void getType() {
        System.out.println("Type: Generic Document - parent");
    }
}
