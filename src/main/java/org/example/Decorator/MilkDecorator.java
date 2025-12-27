package org.example.Decorator;

public class MilkDecorator extends CoffeeDecorator{

    public MilkDecorator(Coffee coffee){
        super(coffee);
    }
    @Override
    public double cost() {
        return this.coffee.cost() + 10;
    }
}
