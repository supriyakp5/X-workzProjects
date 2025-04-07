package com.xworkz.inheritence.innternal.Account;

public class AccountRunner {
    public static void main(String[] args){
        Account a1 = new Account();
        a1.login();
        a1.getUsername();
        a1.getEmail();
        a1.getCreationDate();
        a1.getStatus();

        System.out.println("-----");

        Account a2 = new UserAccount();
        a2.login();
        a2.getUsername();
        a2.getEmail();
        a2.getCreationDate();
        a2.getStatus();

        System.out.println("-----");

        UserAccount a3 = new UserAccount();
        a3.login();
        a3.getUsername();
        a3.getEmail();
        a3.getCreationDate();
        a3.getStatus();


        System.out.println("------------casting----------------");


        Accountcast accountcast=new Accountcast();
        accountcast.savingAccount(a1);
        accountcast.savingAccount(a2);
        accountcast.savingAccount(a3);


    }
    }