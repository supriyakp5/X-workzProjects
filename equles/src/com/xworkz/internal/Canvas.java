package com.xworkz.internal;

public class Canvas {
    public int hashCode(){
        return 4997;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof Canvas) {
                System.out.println("Ref is canvas,it will compare....");
                Canvas canvas = this;
                Canvas canvas1 = (Canvas) obj;
                if (canvas.material.equals(canvas1.material)) {
                    System.out.println("Both Canvas are same");
                    return true;
                }
            }
        }
        return false;
    }
}

