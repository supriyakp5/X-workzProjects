package com.xworkz.InterfaceClass.intrnal;

public class AirtelInternetImp implements InternalProvider {
    public AirtelInternetImp(){
        System.out.println("no-arg Airtalinternetimp");
    }
    @Override
    public void accessInternet(){
        System.out.println("running accssinternet");
    }
}
