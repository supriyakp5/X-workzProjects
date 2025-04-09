package com.xworkz.Tostring.internal;

public class Ruler {
    private String name;
    private int id;
    private double value;

    public Ruler(String name, int id, double value) {
        this.name = name;
        this.id = id;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Ruler{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", value=" + value +
                '}';
    }
}
