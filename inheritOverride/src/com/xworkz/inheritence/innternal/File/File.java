package com.xworkz.inheritence.innternal.File;

public class File {
    public File() {
        System.out.println("File constructor - parent");
    }

    public void open() {
        System.out.println("Opening file - parent");
    }

    public void read() {
        System.out.println("Reading file - parent");
    }

    public void close() {
        System.out.println("Closing file - parent");
    }

    public void getSize() {
        System.out.println("Getting file size - parent");
    }
}
