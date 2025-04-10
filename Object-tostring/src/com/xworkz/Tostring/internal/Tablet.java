package com.xworkz.Tostring.internal;

public class Tablet {
    private String name;
    private int id;
    private double value;

    public Tablet(String name, int id, double value) {
        this.name = name;
        this.id = id;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Tablet{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", value=" + value +
                '}';
    }
    @Override
    public int hashCode()
    {
        return 83;
    }

}
