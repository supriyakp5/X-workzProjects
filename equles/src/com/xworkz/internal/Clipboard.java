package com.xworkz.internal;

public class Clipboard {
    public int hashCode(){
        return 33397;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof Clipboard) {
                System.out.println("Ref is clipboard,it will compare....");
                Clipboard clipboard = this;
                Clipboard clipboard1 = (Clipboard) obj;
                if (clipboard.shape.equals(clipboard1.shape)) {
                    System.out.println("Both clipboard are same");
                    return true;
                }
            }
        }
        return false;
    }
}

