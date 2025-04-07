package com.xworkz.inheritence.innternal.Account;

class UserAccount extends Account {
    public UserAccount() {
        super();
        System.out.println("UserAccount constructor - child");
    }

    @Override
    public void login() {
        System.out.println("Logging in as user - child");
    }

    @Override
    public void getUsername() {
        System.out.println("User username - child");
    }

    @Override
    public void getEmail() {
        System.out.println("User email - child");
    }

    @Override
    public void getCreationDate() {
        System.out.println("User account creation date - child");
    }

    @Override
    public void getStatus() {
        System.out.println("User account status - child");
    }
    public void logOut()
    {
        System.out.println("user logOut -child");
    }

}
