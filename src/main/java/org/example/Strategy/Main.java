package org.example.Strategy;

public class Main {

    public static void main(String[] args) {
        PaymentService service = new PaymentService(new UPI());
        service.makePayment(100);

        service.setStrategy(new Card());
        service.makePayment(2000);
    }
}
