package com.xworkz.Tostring.internal;

public class Hammer {
    private String type;
    private int weight;
    private double price;

    public Hammer(String type, int weight, double price) {
        this.type = type;
        this.weight = weight;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Hammer{" +
                "type='" + type + '\'' +
                ", weight=" + weight +
                ", price=" + price +
                '}';
    }
    @Override
    public int hashCode()
    {
        return 41;
    }

}

