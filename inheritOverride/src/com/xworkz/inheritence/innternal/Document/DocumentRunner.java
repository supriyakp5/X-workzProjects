package com.xworkz.inheritence.innternal.Document;

public class DocumentRunner {
    public static void main(String[] args) {
        Document d1 = new Document();
        d1.open();
        d1.close();
        d1.print();
        d1.save();
        d1.getType();

        System.out.println("-----");

        Document d2 = new PDFDocument();
        d2.open();
        d2.close();
        d2.print();
        d2.save();
        d2.getType();

        System.out.println("-----");

        PDFDocument d3 = new PDFDocument();
        d3.open();
        d3.close();
        d3.print();
        d3.save();
        d3.getType();
    }
}
