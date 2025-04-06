package com.xworkz.inheritence.innternal.Payment;

public class PaymentRunner {
    public static void main(String[] args) {
        Payment p1 = new Payment();
        p1.process();
        p1.validate();
        p1.refund();
        p1.status();

        System.out.println("-----");

        Payment p2 = new CreditCardPayment();
        p2.process();
        p2.validate();
        p2.refund();
        p2.status();

        System.out.println("-----");

        CreditCardPayment p3 = new CreditCardPayment();
        p3.process();
        p3.validate();
        p3.refund();
        p3.status();
    }
}
