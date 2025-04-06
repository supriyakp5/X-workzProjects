package com.xworkz.inheritence.innternal.Competition;

public class CompetitionRunner {
    public static void main(String[] args) {
        Competition c1 = new Competition();
        c1.register();
        c1.start();
        c1.declareWinner();

        System.out.println("-----");

        Competition c2 = new CodingCompetition();
        c2.register();
        c2.start();
        c2.declareWinner();

        System.out.println("-----");

        CodingCompetition c3 = new CodingCompetition();
        c3.register();
        c3.start();
        c3.declareWinner();
    }
}
