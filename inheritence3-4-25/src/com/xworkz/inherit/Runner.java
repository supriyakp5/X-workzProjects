package com.xworkz.inherit;

public class Runner {

    public static void main(String[] args) {
        Guitar myGuitar = new Guitar();
        myGuitar.play();
        myGuitar.tune();
        myGuitar.strum();
        myGuitar.pick();


        Laptop1 myLaptop = new Laptop1();
        myLaptop.processData();
        myLaptop.displayOutput();
        myLaptop.portability();
        myLaptop.batteryLife();

        Flower rose = new Flower();
        rose.grow();
        rose.photosynthesize();
        rose.bloom();
        rose.produceScent();

        Hammer myHammer = new Hammer();
        myHammer.use();
        myHammer.maintain();
        myHammer.strike();
        myHammer.pullNails();


        Coffee myCoffee = new Coffee();
        myCoffee.consume();
        myCoffee.prepare();
        myCoffee.addMilk();
        myCoffee.addSugar();
    }
}
