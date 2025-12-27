package org.example.Strategy;

public class Card implements PaymentStrategy{
    @Override
    public void pay(double amount) {
        System.out.println("Paying via card " + amount);
    }
}
