package com.xworkz.inheritence.innternal.Payment1;

public class Payment1 {
    public Payment1() {
        System.out.println("Payment constructor - parent");
    }

    public void pay() {
        System.out.println("Paying amount - parent");
    }

    public void confirm() {
        System.out.println("Confirming payment - parent");
    }

    public void cancel() {
        System.out.println("Cancelling payment - parent");
    }

    public void refund() {
        System.out.println("Processing refund - parent");
    }
}
