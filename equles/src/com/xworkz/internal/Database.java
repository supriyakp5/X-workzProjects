package com.xworkz.internal;

public class Database {
    public int hashCode(){
        return 6897;
    }



    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Refer is not null");
            if (obj instanceof Database) {
                System.out.println("Ref is database,it will compare....");
                Database database = this;
                Database database1 = (Database) obj;
                if (database.duration.equals(database1.duration)) {
                    System.out.println("Both database are same");
                    return true;
                }
            }
        }
        return false;
    }
}

