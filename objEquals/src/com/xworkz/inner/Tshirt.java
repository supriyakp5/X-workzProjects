package com.xworkz.inner;

public class Tshirt {

    private String brand;
    private char size;
    private String color;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            System.out.println("ref is not null");

            if (obj instanceof Tshirt) {
                System.out.println("ref is tshirt will compare");
                Tshirt tshirt1 = this;
                Tshirt tshirt2 = (Tshirt) obj;

                if (tshirt1.brand == tshirt2.brand && tshirt1.size == tshirt2.size && tshirt1.color == tshirt2.color) {
                    System.out.println(" is same");
                    return true;
                }
            }

        }
        return false;
    }

}
