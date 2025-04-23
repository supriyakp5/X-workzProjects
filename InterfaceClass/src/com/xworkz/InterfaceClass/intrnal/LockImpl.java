package com.xworkz.InterfaceClass.intrnal;

public class LockImpl implements Lock {
    @Override
    public void operateLock() {
        System.out.println("Operating LockImpl...");
    }
}
