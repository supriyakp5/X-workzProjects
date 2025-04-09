package com.xworkz.Tostring.internal;

public class SoapDispenser {
    private String name;
    private int id;
    private double value;

    public SoapDispenser(String name, int id, double value) {
        this.name = name;
        this.id = id;
        this.value = value;
    }

    @Override
    public String toString() {
        return "SoapDispenser{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", value=" + value +
                '}';
    }
}
