package org.example.Adapter;

public class RazorpayAdapter implements IPaymentProcessor{

    //is-a with Ipaymentprocessor
    //has a with adaptee - razorpay

    private Razorpay razorpay;

    public RazorpayAdapter(Razorpay razorpay){
        this.razorpay = razorpay;
    }
    @Override
    public void pay(double amount) {
        razorpay.makePayment(amount);
    }
}
