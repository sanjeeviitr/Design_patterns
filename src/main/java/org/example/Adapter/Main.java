package org.example.Adapter;

public class Main {

    public static void main(String[] args) {

        //is-a with Ipaymentprocessor
        //has a with adaptee - razorpay
        IPaymentProcessor processor = new RazorpayAdapter(new Razorpay());
        processor.pay(500);
    }
}
