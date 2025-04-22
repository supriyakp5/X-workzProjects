package com.xworkz.InterfaceClass.external;

import com.xworkz.InterfaceClass.intrnal.InternalProvider;

public class InternelUser {
    private InternalProvider internalProvider;
    public InternelUser(InternalProvider internalProvider)
    {
        this.internalProvider=internalProvider;
        System.out.println("internal provider in internaluser");
        }
        public void provided(){
        System.out.println("runner provided");

        if(this.internalProvider!=null)
        {
            this.internalProvider.accessInternet();
        }

        }
}
