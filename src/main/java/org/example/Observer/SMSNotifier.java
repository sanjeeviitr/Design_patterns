package org.example.Observer;

public class SMSNotifier implements OrderObserver{
    @Override
    public void update(String status) {
        System.out.println("SMS sent : Order " + status);
    }
}
