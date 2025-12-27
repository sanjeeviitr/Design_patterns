package org.example.Decorator;

public class SugarDecorator extends CoffeeDecorator{

    public SugarDecorator(Coffee coffee){
        super(coffee);
    }
    @Override
    public double cost() {
        return this.coffee.cost() + 20;
    }
}
