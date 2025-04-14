package com.xworkz.internal;

public class Disinfectant {
    public int hashCode(){
        return 6897;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof Disinfectant) {
                System.out.println("Ref is disinfectant,it will compare....");
                Disinfectant disinfectant = this;
                Disinfectant disinfectant1 = (Disinfectant) obj;
                if (disinfectant.width.equals(disinfectant1.width)) {
                    System.out.println("Both disinfectant are same");
                    return true;
                }
            }
        }
        return false;
    }

}

