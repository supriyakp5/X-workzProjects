package com.xworkz.inheritence.innternal.Account1;

public class AccountRunner {
    public static void main(String[] args) {
        Account1 a1 = new Account1();
        a1.access();
        a1.getHolderName();
        a1.getBalance();
        a1.getAccountNumber();
        a1.getType();

        System.out.println("-----");

        Account1 a2 = new BankAccount();
        a2.access();
        a2.getHolderName();
        a2.getBalance();
        a2.getAccountNumber();
        a2.getType();

        System.out.println("-----");

        BankAccount a3 = new BankAccount();
        a3.access();
        a3.getHolderName();
        a3.getBalance();
        a3.getAccountNumber();
        a3.getType();
    }
}
