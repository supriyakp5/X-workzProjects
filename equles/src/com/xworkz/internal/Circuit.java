package com.xworkz.internal;

public class Circuit {
    public int hashCode(){
        return 12397;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof Circuit) {
                System.out.println("Ref is circuit,it will compare....");
                Circuit circuit = this;
                Circuit circuit1 = (Circuit) obj;
                if (circuit.width.equals(circuit1.width)) {
                    System.out.println("Both circuit are same");
                    return true;
                }
            }
        }
        return false;
    }
}

