package com.xworkz.inheritence.innternal.Payment1;

public class CreditCardPayment extends Payment1{
    public CreditCardPayment() {
        super();
        System.out.println("CreditCardPayment constructor - child");
    }

    @Override
    public void pay() {
        System.out.println("Paying via credit card - child");
    }

    @Override
    public void confirm() {
        System.out.println("Credit card payment confirmed - child");
    }

    @Override
    public void cancel() {
        System.out.println("Credit card payment cancelled - child");
    }

    @Override
    public void refund() {
        System.out.println("Refunding to credit card - child");
    }
}
