package com.xworkz.inheritence.innternal;

public class Wrench extends Toolbox{
    public Wrench() {
        super();
        System.out.println("Wrench constructor - child");
    }

    @Override
    public void useTool() {
        System.out.println("Using wrench to tighten bolts - child");
    }

    @Override
    public void listTools() {
        System.out.println("Tool: Wrench - child");
    }

    @Override
    public void open() {
        System.out.println("Opening wrench kit - child");
    }

    @Override
    public void close() {
        System.out.println("Closing wrench kit - child");
    }
}
