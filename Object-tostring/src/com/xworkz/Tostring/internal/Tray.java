package com.xworkz.Tostring.internal;

public class Tray {
    private String name;
    private int id;
    private double value;

    public Tray(String name, int id, double value) {
        this.name = name;
        this.id = id;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Tray{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", value=" + value +
                '}';
    }
    @Override
    public int hashCode()
    {
        return 82;
    }

}
