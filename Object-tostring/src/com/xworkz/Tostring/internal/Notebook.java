package com.xworkz.Tostring.internal;

public class Notebook {
    private String name;
    private int id;
    private double value;

    public Notebook(String name, int id, double value) {
        this.name = name;
        this.id = id;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", value=" + value +
                '}';
    }
}
