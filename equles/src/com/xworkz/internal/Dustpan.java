package com.xworkz.internal;

public class Dustpan {
    public int hashCode(){
        return 75903;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof Dustpan) {
                System.out.println("Ref is dustpan,it will compare....");
                Dustpan dustpan = this;
                Dustpan dustpan1 = (Dustpan) obj;
                if (dustpan.density.equals(dustpan1.density)) {
                    System.out.println("Both dustpan are same");
                    return true;
                }
            }
        }
        return false;
    }
}

