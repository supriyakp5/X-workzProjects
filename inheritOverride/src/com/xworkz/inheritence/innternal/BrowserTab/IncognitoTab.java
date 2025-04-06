package com.xworkz.inheritence.innternal.BrowserTab;

public class IncognitoTab extends BrowserTab{
    public IncognitoTab() {
        super();
        System.out.println("IncognitoTab constructor - child");
    }

    @Override
    public void open() {
        System.out.println("Opening incognito tab - child");
    }

    @Override
    public void browse() {
        System.out.println("Private browsing session - child");
    }

    @Override
    public void close() {
        System.out.println("Closing incognito tab - child");
    }

    @Override
    public void history() {
        System.out.println("No history saved - child");
    }

}
