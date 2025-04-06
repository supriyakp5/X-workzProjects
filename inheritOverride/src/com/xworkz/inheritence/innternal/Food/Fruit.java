package com.xworkz.inheritence.innternal.Food;

class Fruit extends Food {
    public Fruit() {
        super();
        System.out.println("Fruit constructor - child");
    }

    @Override
    public void eat() {
        System.out.println("Eating fruit - child");
    }

    @Override
    public void getName() {
        System.out.println("Fruit name - child");
    }

    @Override
    public void getCalories() {
        System.out.println("Fruit calories - child");
    }

    @Override
    public void getOrigin() {
        System.out.println("Fruit origin - child");
    }

    @Override
    public void getType() {
        System.out.println("Fruit type - child");
    }
}
