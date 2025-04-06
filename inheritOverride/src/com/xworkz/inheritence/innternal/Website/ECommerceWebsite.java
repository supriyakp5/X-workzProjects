package com.xworkz.inheritence.innternal.Website;

public class ECommerceWebsite extends Website{
    public ECommerceWebsite() {
        super();
        System.out.println("ECommerceWebsite constructor - child");
    }

    @Override
    public void load() {
        System.out.println("Loading online store - child");
    }

    @Override
    public void showContent() {
        System.out.println("Showing product listings - child");
    }

    @Override
    public void logout() {
        System.out.println("Logging out from e-commerce account - child");
    }

    @Override
    public void getURL() {
        System.out.println("Website URL: shopnow.com - child");
    }

    @Override
    public void getVisitors() {
        System.out.println("Visitors: 10,000+ - child");
    }
}
