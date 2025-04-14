package com.xworkz.internal;

public class Chalk {
    public int hashCode(){
        return 897;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof Chalk) {
                System.out.println("Ref is chalk,it will compare....");
                Chalk chalk = this;
                Chalk chalk1 = (Chalk) obj;
                if (chalk.size.equals(chalk1.size)) {
                    System.out.println("Both chalk are same");
                    return true;
                }
            }
        }
        return false;
    }
}

