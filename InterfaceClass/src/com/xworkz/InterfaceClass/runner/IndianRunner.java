package com.xworkz.InterfaceClass.runner;

import com.xworkz.InterfaceClass.external.Bcci;
import com.xworkz.InterfaceClass.intrnal.Icc;
import com.xworkz.InterfaceClass.intrnal.IndianCricketTeamIcccImpl;

public class IndianRunner {
    public static void main(String[] args){
        Icc icc=new IndianCricketTeamIcccImpl();
        Bcci bcci=new Bcci(icc);
        bcci.ipl();
    }
}
