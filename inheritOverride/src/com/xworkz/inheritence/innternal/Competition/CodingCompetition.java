package com.xworkz.inheritence.innternal.Competition;

public class CodingCompetition extends Competition{
    public CodingCompetition() {
        super();
        System.out.println("CodingCompetition constructor - child");
    }

    @Override
    public void register() {
        System.out.println("Registering with GitHub profile - child");
    }

    @Override
    public void start() {
        System.out.println("Problem statements released - child");
    }

    @Override
    public void declareWinner() {
        System.out.println("Top coders announced - child");
    }
}
