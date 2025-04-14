package com.xworkz.internal;

public class Cooler {
    public int hashCode(){
        return 45897;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof Cooler) {
                System.out.println("Ref is cooler,it will compare....");
                Cooler cooler = this;
                Cooler cooler1 = (Cooler) obj;
                if (cooler.weight.equals(cooler1.weight)) {
                    System.out.println("Both cooler are same");
                    return true;
                }
            }
        }
        return false;
    }
}

