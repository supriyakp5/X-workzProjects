package com.xworxz.inner;

import com.xworkz.outter.*;

public class Runner {

    public static void main(String[] args){
        Home home=new Homes();
        home.address();
        home.design();
        home.garden();
        home.rooms();


       Dog dog=new Dog();
       dog.eat();
       dog.drink();
       dog.makeSound();
       dog.sleep();



       Car car=new Car();
       car.type();
       car.drive();
       car.fuel();
       car.start();
       car.stop();


        Circle circle=new Circle();
        circle.draw();
        circle.erase();
        circle.Area();



        Duck duck=new Duck();
        duck.fly();
        duck.swim();
        duck.eat();
        duck.quack();
        duck.sleep();



        Bike bike=new Bike();
        bike.start();
        bike.stop();
        bike.rotate();
        bike.fuelUp();


        Person person=new Student();
        person.details();
        person.walk();
        person.eat();
        person.sleep();

        Employee employee=new Company();
        employee.work();
        employee.Projects();
        employee.working();




    }

}
