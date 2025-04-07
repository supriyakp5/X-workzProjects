package com.xworkz.inheritence.innternal.BankAccount;

public class BankRunner {
    public static void main(String[] args) {

        BankAccount b1 = new BankAccount();
        b1.deposit();
        b1.withdraw();
        b1.getBalance();
        b1.getAccountType();
        b1.getInterestRate();

        System.out.println("---------------");

        BankAccount b2 = new SavingsAccount();
        b2.deposit();
        b2.withdraw();
        b2.getBalance();
        b2.getAccountType();
        b2.getInterestRate();

        System.out.println("---------------");

        SavingsAccount b3 = new SavingsAccount();
        b3.deposit();
        b3.withdraw();
        b3.getBalance();
        b3.getAccountType();
        b3.getInterestRate();



        System.out.println("____________casting_________");
        Account account=new Account();
        account.Bank(b1);
        account.Bank(b2);
        account.Bank(b3);
    }
}
