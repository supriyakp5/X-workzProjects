package com.xworkz.inheritence.innternal.Document;

public class PDFDocument extends Document{
    public PDFDocument() {
        super();
        System.out.println("PDFDocument constructor - child");
    }

    @Override
    public void open() {
        System.out.println("Opening PDF in viewer - child");
    }

    @Override
    public void close() {
        System.out.println("Closing PDF - child");
    }

    @Override
    public void print() {
        System.out.println("Printing PDF - child");
    }

    @Override
    public void save() {
        System.out.println("Saving PDF to disk - child");
    }

    @Override
    public void getType() {
        System.out.println("Type: PDF Document - child");
    }
}
