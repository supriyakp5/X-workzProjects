package com.xworkz.InterfaceClass.intrnal;

public class PrinterImpl implements Printer {
    @Override
    public void print() {
        System.out.println("Printing from PrinterImpl...");
    }
}
