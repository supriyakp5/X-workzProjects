package com.xworkz.InterfaceClass.external;

import com.xworkz.InterfaceClass.intrnal.Icc;

public class Bcci {
    private Icc icc;
    public Bcci(Icc icc){
        this.icc=icc;
        System.out.println("bcc in icc");

    }
    public void ipl(){
        System.out.println("running ipl");
        if(this.icc !=null){
            this.icc.fairPlay();
        }
    }
}
