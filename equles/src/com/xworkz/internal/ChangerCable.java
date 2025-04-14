package com.xworkz.internal;

public class ChangerCable {
    public int hashCode(){
        return 2397;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof ChargerCable) {
                System.out.println("Ref is chargercable,it will compare....");
                ChargerCable chargercable = this;
                ChargerCable chargerCable1 = (ChargerCable) obj;
                if (chargercable.flexibility.equals(chargerCable1.flexibility)) {
                    System.out.println("Both chargercable are same");
                    return true;
                }
            }
        }
        return false;
    }
}

