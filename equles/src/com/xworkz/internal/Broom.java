package com.xworkz.internal;

public class Broom {
    public int hashCode(){
        return 600;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof Broom) {
                System.out.println("Ref is broom,it will compare....");
                Broom broom = this;
                Broom broom1 = (Broom) obj;
                if (broom.density.equals(broom1.density)) {
                    System.out.println("Both broom are same");
                    return true;
                }
            }
        }
        return false;
    }
}
