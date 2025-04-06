package com.xworkz.inheritence.innternal.Payment;

public class CreditCardPayment extends Payment{
    public CreditCardPayment() {
        super();
        System.out.println("CreditCardPayment constructor - child");
    }

    @Override
    public void process() {
        System.out.println("Processing credit card payment - child");
    }

    @Override
    public void validate() {
        System.out.println("Validating card number - child");
    }

    @Override
    public void refund() {
        System.out.println("Refunding to credit card - child");
    }

    @Override
    public void status() {
        System.out.println("Status: Approved - child");
    }
}
