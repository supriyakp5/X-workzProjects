package com.xworkz.Tostring.internal;

public class Scanner {
    private String name;
    private int id;
    private double value;

    public Scanner(String name, int id, double value) {
        this.name = name;
        this.id = id;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Scanner{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", value=" + value +
                '}';
    }
}
