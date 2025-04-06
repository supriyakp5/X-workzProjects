package com.xworkz.inheritence.innternal.Payment;

public class Payment {
    public Payment() {
        System.out.println("Payment constructor - parent");
    }

    public void process() {
        System.out.println("Processing payment - parent");
    }

    public void validate() {
        System.out.println("Validating payment - parent");
    }

    public void refund() {
        System.out.println("Refunding payment - parent");
    }

    public void status() {
        System.out.println("Status: Completed - parent");
    }
}
