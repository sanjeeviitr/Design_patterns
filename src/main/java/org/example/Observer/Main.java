package org.example.Observer;

public class Main {

    public static void main(String[] args) {
        OrderObserver email = new EmailNotifier();
        OrderObserver sms = new SMSNotifier();

        Order order = new Order();
        order.register(email);
        order.register(sms);
        order.register(new WhatsappNotifier());

        order.setStatus("Cancelled");
        order.setStatus("Delivered");

        order.remove(email);
        order.setStatus("Placed");
    }
}
