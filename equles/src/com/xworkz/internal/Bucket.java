package com.xworkz.internal;

public class Bucket {
    public int hashCode(){
        return 790;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof Bucket) {
                System.out.println("Ref is bucket,it will compare....");
                Bucket bucket = this;
                Bucket bucket1 = (Bucket) obj;
                if (bucket.duration.equals(bucket1.duration)) {
                    System.out.println("Both bucket are same");
                    return true;
                }
            }
        }
        return false;
    }
}

