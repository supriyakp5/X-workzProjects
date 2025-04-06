package com.xworkz.inheritence.innternal.File;

public class FileRunner {
    public static void main(String[] args) {
        File f1 = new File();
        f1.open();
        f1.read();
        f1.close();
        f1.getSize();

        System.out.println("-----");

        File f2 = new AudioFile();
        f2.open();
        f2.read();
        f2.close();
        f2.getSize();

        System.out.println("-----");

        AudioFile f3 = new AudioFile();
        f3.open();
        f3.read();
        f3.close();
        f3.getSize();
    }
}
