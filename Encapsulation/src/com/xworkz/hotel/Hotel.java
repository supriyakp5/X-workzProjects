package com.xworkz.hotel;

public class Hotel {
    private String name;
    private String area;

    public Hotel(String name,String area)
    {
        this.name=name;
        this.area=area;
        System.out.println("encapsulation");
    }
    public String getName()
    {
        return name;
    }
    public String getArea()
    {
        return area;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void setArea(String area)
    {
        this.area=area;
    }
}

