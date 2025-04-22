package com.xworkz.InterfaceClass.external;

import com.xworkz.InterfaceClass.intrnal.Connector;

public class ConnectorUser {
    private Connector connector;
    public ConnectorUser(Connector connector){
        this.connector=connector;
        System.out.print("using connector arg in connector class");
    }
    public void execute()
    {
        System.out.println("running execute ");
        if(this.connector!=null)
        {
            this.connector.run();

        }
        else
        {
            System.err.println("connector is null");
        }
    }

}
