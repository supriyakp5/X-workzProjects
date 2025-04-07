package com.xworkz.inheritence.innternal.Toolbox;

public class ToolboxRunner {
    public static void main(String[] args) {
        Toolbox t1 = new Toolbox();
        t1.open();
        t1.useTool();
        t1.close();
        t1.listTools();

        System.out.println("-----");

        Toolbox t2 = new Wrench();
        t2.open();
        t2.useTool();
        t2.close();
        t2.listTools();

        System.out.println("-----");

        Wrench t3 = new Wrench();
        t3.open();
        t3.useTool();
        t3.close();
        t3.listTools();
    }

}
