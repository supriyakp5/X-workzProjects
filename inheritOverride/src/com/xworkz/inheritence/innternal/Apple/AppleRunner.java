package com.xworkz.inheritence.innternal.Apple;

public class AppleRunner {

        public static void main(String[] args) {
            Apple apple1 = new Apple();
            apple1.taste();
            apple1.provideNutrition();
            apple1.boostImmunity();
            apple1.availableInSeasons();
            apple1.usedInCooking();

            System.out.println("-------------------");
            Apple apple = new GreenApple();
            apple.taste();
            apple.provideNutrition();
            apple.boostImmunity();
            apple.availableInSeasons();
            apple.usedInCooking();

            System.out.println("-----------------");
            GreenApple greenApple = new GreenApple();
            greenApple.taste();
            greenApple.provideNutrition();
            greenApple.boostImmunity();
            greenApple.availableInSeasons();
            greenApple.usedInCooking();
        }
    }

