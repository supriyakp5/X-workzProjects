package com.xworkz.inheritence.innternal.VehicleRental;

public class VehicleRental {
    public VehicleRental() {
        System.out.println("VehicleRental constructor - parent");
    }

    public void bookVehicle() {
        System.out.println("Booking a general vehicle - parent");
    }

    public void showRates() {
        System.out.println("Showing base rental rates - parent");
    }

    public void cancelBooking() {
        System.out.println("Cancelling vehicle booking - parent");
    }
}
