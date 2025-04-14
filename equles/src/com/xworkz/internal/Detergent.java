package com.xworkz.internal;

public class Detergent {
    public int hashCode(){
        return 4597;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof Detergent) {
                System.out.println("Ref is detergent,it will compare....");
                Detergent detergent = this;
                Detergent detergent1 = (Detergent) obj;
                if (detergent.brightness.equals(detergent1.brightness)) {
                    System.out.println("Both detergent are same");
                    return true;
                }
            }
        }
        return false;
    }
}

