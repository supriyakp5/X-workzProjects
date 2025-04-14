package com.xworkz.internal;

public class Crutch {
    public int hashCode(){
        return 35897;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof Crutch) {
                System.out.println("Ref is crutch,it will compare....");
                Crutch crutch = this;
                Crutch crutch1 = (Crutch) obj;
                if (crutch.density.equals(crutch1.density)) {
                    System.out.println("Both crutch are same");
                    return true;
                }
            }
        }
        return false;
    }
}

