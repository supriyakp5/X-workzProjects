package com.xworkz.internal;

public class Bleach {
    public int hashCode(){
        return 1870;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof Bleach) {
                System.out.println("Ref is bleach,it will compare....");
                Bleach bleach = this;
                Bleach bleach1 = (Bleach) obj;
                if (bleach.flexibility.equals(bleach1.flexibility)) {
                    System.out.println("Both bleach are same");
                    return true;
                }
            }
        }
        return false;
    }
}

