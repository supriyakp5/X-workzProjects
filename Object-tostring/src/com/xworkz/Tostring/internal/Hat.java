package com.xworkz.Tostring.internal;

public class Hat {
    private String style;
    private int size;
    private double cost;

    public Hat(String style, int size, double cost) {
        this.style = style;
        this.size = size;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Hat{" +
                "style='" + style + '\'' +
                ", size=" + size +
                ", cost=" + cost +
                '}';
    }
    @Override
    public int hashCode()
    {
        return 42;
    }

}
