package org.example.Observer;

public class EmailNotifier implements OrderObserver{
    @Override
    public void update(String status) {
        System.out.println("Email sent : Order " + status);
    }
}
