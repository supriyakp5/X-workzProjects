package com.xworkz.internal;

public class Bolt {
    public int hashCode(){
        return 450;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof Bolt) {
                System.out.println("Ref is bolt,it will compare....");
                Bolt bolt = this;
                Bolt bolt1 = (Bolt) obj;
                if (bolt.texture.equals(bolt1.texture)) {
                    System.out.println("Both bolt are same");
                    return true;
                }
            }
        }
        return false;
    }
}

