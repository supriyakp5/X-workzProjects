package com.xworkz.inheritence.innternal.Software;

public class MobileApp extends Software{
    public MobileApp() {
        super();
        System.out.println("MobileApp constructor - child");
    }

    @Override
    public void getName() {
        System.out.println("App: ChatBuzz - child");
    }

    @Override
    public void getVersion() {
        System.out.println("Version 3.1.2 - child");
    }

    @Override
    public void getLicenseType() {
        System.out.println("Freemium - child");
    }

    @Override
    public void getPlatform() {
        System.out.println("iOS and Android - child");
    }

    @Override
    public void getDeveloper() {
        System.out.println("Developer: AppMakers Inc. - child");
    }
}
