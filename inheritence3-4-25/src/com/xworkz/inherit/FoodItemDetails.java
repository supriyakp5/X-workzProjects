package com.xworkz.inherit;


public class FoodItemDetails extends FoodItem{
    public void prepare(){
        System.out.println("Prepare food");
    }
    public void serve(){
        System.out.println("Serve the food");
    }
    public void addToBill(){
        System.out.println("Add to bill");
    }
    public void getCalories(){
        System.out.println("Calories");
    }
    public void applyDiscount(){
        System.out.println("Discount applied");
    }
}
