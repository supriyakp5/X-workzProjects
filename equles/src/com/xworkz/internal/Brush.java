package com.xworkz.internal;

public class Brush {
    public int hashCode(){
        return 89;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof BrushPen) {
                System.out.println("Ref is brushpen,it will compare....");
                BrushPen brushpen = this;
                BrushPen brushpen1 = (BrushPen) obj;
                if (brushpen.height.equals(brushpen1.height)) {
                    System.out.println("Both brushpen are same");
                    return true;
                }
            }
        }
        return false;
    }
}

