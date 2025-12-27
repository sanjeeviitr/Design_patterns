package org.example.Strategy;

public class Cash implements PaymentStrategy{
    @Override
    public void pay(double amount) {
        System.out.println("Paying via cash " + amount);
    }
}
