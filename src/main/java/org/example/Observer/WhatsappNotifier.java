package org.example.Observer;

public class WhatsappNotifier implements OrderObserver{
    @Override
    public void update(String status) {
        System.out.println("Whatsapp Sms send : Order " + status);
    }
}
