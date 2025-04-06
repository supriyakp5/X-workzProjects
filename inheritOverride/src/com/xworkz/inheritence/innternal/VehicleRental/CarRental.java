package com.xworkz.inheritence.innternal.VehicleRental;

public class CarRental extends VehicleRental{
    public CarRental() {
        super();
        System.out.println("CarRental constructor - child");
    }

    @Override
    public void bookVehicle() {
        System.out.println("Booking a car - child");
    }

    @Override
    public void showRates() {
        System.out.println("Showing car rental rates - child");
    }

    @Override
    public void cancelBooking() {
        System.out.println("Car rental booking cancelled - child");
    }
}
