package com.xworkz.inheritence.innternal.Building;

public class Office {
    public void google(Building b1){
        b1.build();
        b1.getFloors();
        b1.getFloors();
        b1.getType();
        b1.getMaterial();

        if(b1 instanceof House)
        {
            System.out.println("b1 instanceof house");
            House house=(House) b1;
            house.home();
        }

    }
}
