package org.example.Strategy;

public class UPI implements PaymentStrategy{
    @Override
    public void pay(double amount) {
        System.out.println("Paying via UPI " + amount);
    }
}
