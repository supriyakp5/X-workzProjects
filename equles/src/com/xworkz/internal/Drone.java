package com.xworkz.internal;

public class Drone {
    public int hashCode(){
        return 800102;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof Drone) {
                System.out.println("Ref is drone,it will compare....");
                Drone drone = this;
                Drone drone1 = (Drone) obj;
                if (drone.texture.equals(drone1.texture)) {
                    System.out.println("Both drone are same");
                    return true;
                }
            }
        }
        return false;
    }
}

