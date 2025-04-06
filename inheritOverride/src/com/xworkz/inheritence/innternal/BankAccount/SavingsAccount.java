package com.xworkz.inheritence.innternal.BankAccount;

class SavingsAccount extends BankAccount {
    public SavingsAccount() {
        super();
        System.out.println("Running non-arg constructor SavingsAccount--child");
    }

    @Override
    public void deposit() {
        System.out.println("SavingsAccount deposit method--child");
    }

    @Override
    public void withdraw() {
        System.out.println("SavingsAccount withdraw method--child");
    }

    @Override
    public void getBalance() {
        System.out.println("SavingsAccount getBalance method--child");
    }

    @Override
    public void getAccountType() {
        System.out.println("SavingsAccount getAccountType method--child");
    }

    @Override
    public void getInterestRate() {
        System.out.println("SavingsAccount getInterestRate method--child");
    }
}
