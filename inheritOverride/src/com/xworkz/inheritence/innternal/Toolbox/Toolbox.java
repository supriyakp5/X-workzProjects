package com.xworkz.inheritence.innternal.Toolbox;

public class Toolbox {
    public Toolbox() {
        System.out.println("Toolbox constructor - parent");
    }

    public void open() {
        System.out.println("Opening toolbox - parent");
    }

    public void useTool() {
        System.out.println("Using general tool - parent");
    }

    public void close() {
        System.out.println("Closing toolbox - parent");
    }

    public void listTools() {
        System.out.println("Listing all tools - parent");
    }
}
