package com.xworkz.InterfaceClass.runner;

import com.xworkz.InterfaceClass.external.People;
import com.xworkz.InterfaceClass.intrnal.CitizenConstituionImp;
import com.xworkz.InterfaceClass.intrnal.Consitution;

public class ConsitutionRunner {
    public static void main(String[] args){
        Consitution consitution=new CitizenConstituionImp();
        People people=new People(consitution);

    }
}
