package com.xworkz.inheritence.innternal.Browser;

public class ChromeBrowser extends Browser{
    public ChromeBrowser() {
        super();
        System.out.println("ChromeBrowser constructor - child");
    }

    @Override
    public void open() {
        System.out.println("Opening Chrome browser - child");
    }

    @Override
    public void search() {
        System.out.println("Searching with Google - child");
    }

    @Override
    public void refresh() {
        System.out.println("Refreshing Chrome tab - child");
    }

    @Override
    public void close() {
        System.out.println("Closing Chrome browser - child");
    }
    public void youtube()
    {
        System.out.println("new method ---child");
    }

}
