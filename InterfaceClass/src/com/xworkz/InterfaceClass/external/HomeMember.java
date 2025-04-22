package com.xworkz.InterfaceClass.external;

import com.xworkz.InterfaceClass.intrnal.Animals;
import com.xworkz.InterfaceClass.intrnal.CatImp;

public class HomeMember {
    private Animals animals;

    public HomeMember(CatImp catImp){
        this.animals=animals;
        System.out.println("impliment in homemember");


    }
    public void Dog(){
        System.out.println("running dog");
        if(this.animals!=null){
            this.animals.pet();
        }
    }
}
