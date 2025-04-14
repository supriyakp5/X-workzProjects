package com.xworkz.internal;

public class Cello {
    public int hashCode(){
        return 4897;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof Cello) {
                System.out.println("Ref is cello,it will compare....");
                Cello cello = this;
                Cello cello1 = (Cello) obj;
                if (cello.speed.equals(cello1.speed)) {
                    System.out.println("Both cello are same");
                    return true;
                }
            }
        }
        return false;
    }
}

