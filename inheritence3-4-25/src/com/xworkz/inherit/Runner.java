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

        Rectangle rect = new Rectangle();
        rect.draw();
        rect.resize();
        rect.calculateArea();
        rect.calculatePerimeter();

        Bicycle1 bike = new Bicycle1();
        bike.move();
        bike.stop();
        bike.pedal();
        bike.ringBell();

    }
}
