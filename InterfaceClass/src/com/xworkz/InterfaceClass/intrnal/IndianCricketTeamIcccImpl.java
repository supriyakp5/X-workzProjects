package com.xworkz.InterfaceClass.intrnal;

public class IndianCricketTeamIcccImpl implements Icc {
    public IndianCricketTeamIcccImpl()
    {
        System.out.println("no-arg indiancricketiccImpl");
    }
    @Override
    public void fairPlay(){
        System.out.println("running fairplay in indianimpl");
    }
}
