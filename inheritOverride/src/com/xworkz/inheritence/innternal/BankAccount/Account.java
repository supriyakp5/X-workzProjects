package com.xworkz.inheritence.innternal.BankAccount;

public class Account {
    public void Bank(BankAccount b1)
    {
        b1.getAccountType();
        b1.deposit();
        b1.getBalance();
        b1.getInterestRate();
        b1.withdraw();


        if(b1 instanceof SavingsAccount)
        {
            System.out.println("b1 instanceof savingaccount");
            SavingsAccount b3=new SavingsAccount();
            b3.balance();
        }
    }
}
