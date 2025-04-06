package com.xworkz.inheritence.innternal.Account1;

public class BankAccount extends Account1{
    public BankAccount() {
        super();
        System.out.println("BankAccount constructor - child");
    }

    @Override
    public void access() {
        System.out.println("Accessing bank account - child");
    }

    @Override
    public void getHolderName() {
        System.out.println("Bank account holder name - child");
    }

    @Override
    public void getBalance() {
        System.out.println("Bank account balance - child");
    }

    @Override
    public void getAccountNumber() {
        System.out.println("Bank account number - child");
    }

    @Override
    public void getType() {
        System.out.println("Bank account type - child");
    }
}
