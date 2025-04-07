package com.xworkz.inheritence.innternal.Account;

public class Accountcast {
    public void savingAccount(Account a1)
    {
        a1.getUsername();
        a1.getCreationDate();
        a1.getEmail();
        a1.login();
        a1.getStatus();

        if (a1 instanceof UserAccount)
        {
            System.out.println("a1 instance of user account");
            UserAccount a3=(UserAccount) a1;
            a3.logOut();
        }
    }
}
