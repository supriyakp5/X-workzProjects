package com.xworkz.internal;

public class Drum {
    public int hashCode(){
        return 30020;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof Drum) {
                System.out.println("Ref is drum,it will compare....");
                Drum drum = this;
                Drum drum1 = (Drum) obj;
                if (drum.capacity.equals(drum1.capacity)) {
                    System.out.println("Both drum are same");
                    return true;
                }
            }
        }
        return false;
    }
}

