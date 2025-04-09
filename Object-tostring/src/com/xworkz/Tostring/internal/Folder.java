package com.xworkz.Tostring.internal;

public class Folder {
    private String label;
    private int pageCount;
    private double thickness;

    public Folder(String label, int pageCount, double thickness) {
        this.label = label;
        this.pageCount = pageCount;
        this.thickness = thickness;
    }

    @Override
    public String toString() {
        return "Folder{" +
                "label='" + label + '\'' +
                ", pageCount=" + pageCount +
                ", thickness=" + thickness +
                '}';
    }

}
