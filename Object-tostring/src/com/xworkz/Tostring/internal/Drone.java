package com.xworkz.Tostring.internal;

public class Drone {
    private String model;
    private int flightTimeMinutes;
    private double rangeKm;

    public Drone(String model, int flightTimeMinutes, double rangeKm) {
        this.model = model;
        this.flightTimeMinutes = flightTimeMinutes;
        this.rangeKm = rangeKm;
    }

    @Override
    public String toString() {
        return "Drone{" +
                "model='" + model + '\'' +
                ", flightTimeMinutes=" + flightTimeMinutes +
                ", rangeKm=" + rangeKm +
                '}';
    }
    @Override
    public int hashCode()
    {
        return 31;
    }

}
