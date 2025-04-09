package com.xworkz.Tostring.runner;

import com.xworkz.Tostring.internal.LifiTransmitter;

public class LifiTransmitterRunner {
    public static void main(String[] args)
    {
        LifiTransmitter lifiTransmitter=new LifiTransmitter(10.0,5.5,true,10.9);
        System.out.println(lifiTransmitter);
    }
}
