package com.xworkz.internal;

public class Easel {
    public int hashCode(){
        return 90103;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof Easel) {
                System.out.println("Ref is easel,it will compare....");
                Easel easel = this;
                Easel easel1 = (Easel) obj;
                if (easel.color.equals(easel1.color)) {
                    System.out.println("Both easel are same");
                    return true;
                }
            }
        }
        return false;
    }
}

