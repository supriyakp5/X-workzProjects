package com.xworkz.inherit;

public class DeviceDetails {
    public class DeviceDetails extends Device {
        public void powerOn(){
            System.out.println("Power On");
        }
        public void powerOff(){
            System.out.println("Power Off");
        }
        public void model(){
            System.out.println("Model of device");
        }
        public void price(){
            System.out.println("Price of device");
        }
        public void brand(){
            System.out.println("Brand of device");
        }
    }

}
