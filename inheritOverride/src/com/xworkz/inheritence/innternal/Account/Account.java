package com.xworkz.inheritence.innternal.Account;

public class Account {
    public Account() {
        System.out.println("Account constructor - parent");
    }

    public void login() {
        System.out.println("Logging in - parent");
    }

    public void getUsername() {
        System.out.println("Account username - parent");
    }

    public void getEmail() {
        System.out.println("Account email - parent");
    }

    public void getCreationDate() {
        System.out.println("Account created on - parent");
    }

    public void getStatus() {
        System.out.println("Account status - parent");
    }
}
