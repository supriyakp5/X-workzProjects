package com.xworkz.Tostring.internal;
public class Car {
    private String model;
    private int year;
    private double engineCapacity;

    public Car(String model, int year, double engineCapacity) {
        this.model = model;
        this.year = year;
        this.engineCapacity = engineCapacity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", engineCapacity=" + engineCapacity + " L" +
                '}';
    }
    @Override
    public int hashCode()
    {
        return 23;
    }

}

