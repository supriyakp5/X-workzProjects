package com.xworkz.internal;

public class Crayon {
    public int hashCode(){
        return 85897;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof Crayon) {
                System.out.println("Ref is crayon,it will compare....");
                Crayon crayon = this;
                Crayon crayon1 = (Crayon) obj;
                if (crayon.flexibility.equals(crayon1.flexibility)) {
                    System.out.println("Both crayon are same");
                    return true;
                }
            }
        }
        return false;
    }
}

