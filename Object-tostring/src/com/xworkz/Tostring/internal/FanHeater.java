package com.xworkz.Tostring.internal;

public class FanHeater {
    private String model;
    private int temperatureSettings;
    private double wattage;

    public FanHeater(String model, int temperatureSettings, double wattage) {
        this.model = model;
        this.temperatureSettings = temperatureSettings;
        this.wattage = wattage;
    }

    @Override
    public String toString() {
        return "FanHeater{" +
                "model='" + model + '\'' +
                ", temperatureSettings=" + temperatureSettings +
                ", wattage=" + wattage +
                '}';
    }
    }

