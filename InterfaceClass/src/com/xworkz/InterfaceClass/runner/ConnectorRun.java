package com.xworkz.InterfaceClass.runner;

import com.xworkz.InterfaceClass.external.ConnectorUser;
import com.xworkz.InterfaceClass.intrnal.Connector;
import com.xworkz.InterfaceClass.intrnal.ConnectorImpl;

public class ConnectorRun {
    public static void main(String[] args) {
        Connector connector = new ConnectorImpl();

        ConnectorUser connectorUser = new ConnectorUser(connector);

        connectorUser.execute();


    }
}
