package com.xworkz.Tostring.internal;

public class Mirror {
    private String name;
    private int id;
    private double value;

    public Mirror(String name, int id, double value) {
        this.name = name;
        this.id = id;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Mirror{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", value=" + value +
                '}';
    }
    @Override
    public int hashCode()
    {
        return 54;
    }


}
