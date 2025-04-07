package com.xworkz.inheritence.innternal.Bookstore;

public class GenralBook {
    public void siriBook(Bookstore b1)
    {
        b1.getBookCount();
        b1.getLocation();
        b1.getOpeningHours();
        b1.getOwner();
        b1.getOwner();



        if(b1 instanceof OnlineBookstore)
        {
            System.out.println("b1 instanceof onlinebook");
            OnlineBookstore b3=(OnlineBookstore) b1;
            b3.bookBuy();
        }
    }
}
