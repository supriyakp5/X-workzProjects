package com.xworkz.inheritence.innternal.Payment1;

public class PaymentRunner {
    public static void main(String[] args) {
        Payment1 p1 = new Payment1();
        p1.pay();
        p1.confirm();
        p1.cancel();
        p1.refund();

        System.out.println("-----");

        Payment1 p2 = new CreditCardPayment();
        p2.pay();
        p2.confirm();
        p2.cancel();
        p2.refund();

        System.out.println("-----");

        CreditCardPayment p3 = new CreditCardPayment();
        p3.pay();
        p3.confirm();
        p3.cancel();
        p3.refund();
    }
}
