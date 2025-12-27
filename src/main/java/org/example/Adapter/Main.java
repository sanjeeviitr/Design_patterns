package org.example.Adapter;

public class Main {

    public static void main(String[] args) {
        IPaymentProcessor processor = new RazorpayAdapter(new Razorpay());
        processor.pay(500);
    }
}
