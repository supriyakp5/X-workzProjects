package com.xworkz.outter;

import com.xworkz.inner.Tshirt;

public class TshirtRunner {

    public static void main(String[] args)
    {
        Tshirt tshirt1=new Tshirt();
        tshirt1.setBrand("xwork");
        tshirt1.setSize('m');
        tshirt1.setColor("block");

        Tshirt tshirt2=new Tshirt();
        tshirt2.setBrand("puma");
        tshirt2.setSize('m');
        tshirt2.setColor("red");

        System.out.println("checking same  location:"+(tshirt1==tshirt2));
        boolean same=tshirt2.equals(tshirt1);
        System.out.println("tshirt is same as tshirt2:"+same);


    }
}
