package com.xworkz.InterfaceClass.runner;

import com.xworkz.InterfaceClass.external.InternelUser;
import com.xworkz.InterfaceClass.intrnal.AirtelInternetImp;
import com.xworkz.InterfaceClass.intrnal.InternalProvider;

public class AirtelRunner {
    public static void main(String[] args)
    {
        InternalProvider internalProvider=new AirtelInternetImp();

        InternelUser internelUser=new InternelUser(internalProvider);
        internelUser.provided();
    }
}
