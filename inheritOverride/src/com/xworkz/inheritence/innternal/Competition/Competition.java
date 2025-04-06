package com.xworkz.inheritence.innternal.Competition;

public class Competition {
    public Competition() {
        System.out.println("Competition constructor - parent");
    }

    public void register() {
        System.out.println("Registering for competition - parent");
    }

    public void start() {
        System.out.println("Competition has started - parent");
    }

    public void declareWinner() {
        System.out.println("Announcing the winner - parent");
    }

}
