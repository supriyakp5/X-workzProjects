package com.xworkz.Tostring.internal;

public class Camera {
    private String brand;
    private int resolution; // in megapixels
    private double zoomLevel; // optical zoom

    public Camera(String brand, int resolution, double zoomLevel) {
        this.brand = brand;
        this.resolution = resolution;
        this.zoomLevel = zoomLevel;
    }

    @Override
    public String toString() {
        return "Camera{" +
                "brand='" + brand + '\'' +
                ", resolution=" + resolution + " MP" +
                ", zoomLevel=" + zoomLevel + "x" +
                '}';
    }
}
