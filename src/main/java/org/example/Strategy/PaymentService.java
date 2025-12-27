package org.example.Strategy;

public class PaymentService {
    private PaymentStrategy strategy;

    public PaymentService(PaymentStrategy st){
        this.strategy = st;
    }

    public void setStrategy(PaymentStrategy st){
        this.strategy = st;
    }
    void makePayment(double amount){
        strategy.pay(amount);
    }
}
