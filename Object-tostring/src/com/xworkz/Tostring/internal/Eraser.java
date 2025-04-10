package com.xworkz.Tostring.internal;

public class Eraser {
    private String name;
    private int id;
    private double value;

    public Eraser(String name, int id, double value) {
        this.name = name;
        this.id = id;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Eraser{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", value=" + value +
                '}';
    }
    @Override
    public int hashCode()
    {
        return 32;
    }

}
