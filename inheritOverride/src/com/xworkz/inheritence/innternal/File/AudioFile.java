package com.xworkz.inheritence.innternal.File;

public class AudioFile extends File{
    public AudioFile() {
        super();
        System.out.println("AudioFile constructor - child");
    }

    @Override
    public void open() {
        System.out.println("Opening audio file - child");
    }

    @Override
    public void read() {
        System.out.println("Playing audio file - child");
    }

    @Override
    public void close() {
        System.out.println("Stopping audio file - child");
    }

    @Override
    public void getSize() {
        System.out.println("Audio file size: 5MB - child");
    }
}
