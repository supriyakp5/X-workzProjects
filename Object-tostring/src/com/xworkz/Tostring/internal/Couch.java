package com.xworkz.Tostring.internal;

public class Couch {
    private String fabricType;
    private int seatCount;
    private double width;

    public Couch(String fabricType, int seatCount, double width) {
        this.fabricType = fabricType;
        this.seatCount = seatCount;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Couch{" +
                "fabricType='" + fabricType + '\'' +
                ", seatCount=" + seatCount +
                ", width=" + width + " cm" +
                '}';
    }
}
