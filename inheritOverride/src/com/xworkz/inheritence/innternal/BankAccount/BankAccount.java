package com.xworkz.inheritence.innternal.BankAccount;

public class BankAccount {
    public BankAccount() {
        System.out.println("Running non-arg constructor BankAccount--parent");
    }

    public void deposit() {
        System.out.println("BankAccount deposit method--parent");
    }

    public void withdraw() {
        System.out.println("BankAccount withdraw method--parent");
    }

    public void getBalance() {
        System.out.println("BankAccount getBalance method--parent");
    }

    public void getAccountType() {
        System.out.println("BankAccount getAccountType method--parent");
    }

    public void getInterestRate() {
        System.out.println("BankAccount getInterestRate method--parent");
    }
}
