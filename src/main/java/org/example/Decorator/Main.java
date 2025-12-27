package org.example.Decorator;

public class Main {

    public static void main(String[] args) {

        // to avoid class explosion
        // has-a and is-a both
        Coffee coffee = new BasicCoffee();
        coffee = new MilkDecorator(coffee);
        coffee = new SugarDecorator(coffee);
        System.out.println("Coffee final cost is : " + coffee.cost());
    }
}
