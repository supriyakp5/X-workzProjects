package com.xworkz.inheritence.innternal.Browser;

public class Chrome {
    public void website(Browser b1){
        b1.close();
        b1.open();
        b1.refresh();
        b1.search();

        if(b1 instanceof ChromeBrowser){
            System.out.println("b1 isnstanceof chromebrowser");
            ChromeBrowser b3=(ChromeBrowser) b1;
            b3.youtube();
        }
    }

}
