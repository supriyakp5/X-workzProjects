package com.xworkz.Tostring.internal;

import com.xworkz.Tostring.runner.LifiTransmitterRunner;

public class LifiTransmitter {
    private double intensity;
    private double frequency;
    private boolean status;
    private double dataRate;

    public LifiTransmitter(double intensity, double frequency, boolean status, double dataRate) {
        this.intensity = intensity;
        this.frequency = frequency;
        this.status = status;
        this.dataRate = dataRate;
    }

    @Override
    public String toString() {
        return "LifiTransmitter [intensity=" + intensity + " ,frequency=" + frequency + ",status=" + status + ",dataRate=" + dataRate + "]";
    }
    @Override
    public int hashCode()
    {
        return 51;
    }

}



