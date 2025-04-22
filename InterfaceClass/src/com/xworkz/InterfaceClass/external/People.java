package com.xworkz.InterfaceClass.external;

import com.xworkz.InterfaceClass.intrnal.Consitution;

public class People {
    private Consitution consitution;
    public People(Consitution consitution){
        this.consitution=consitution;
        System.out.println("constitution in people");
        if(this.consitution!=null){
            this.consitution.followLaws();
        }
    }
}
