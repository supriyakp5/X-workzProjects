package com.xworkz.InterfaceClass.runner;

import com.xworkz.InterfaceClass.external.HomeMember;
import com.xworkz.InterfaceClass.intrnal.Animals;
import com.xworkz.InterfaceClass.intrnal.CatImp;

public class AnimalRunner {
    public static void main(String[] args){
        Animals animals=new CatImp();
        HomeMember homeMember=new HomeMember(animals);
        homeMember.Dog();
    }
}
