package org.example.Observer;

import java.util.ArrayList;
import java.util.List;

public class Order implements OrderSubject{

    private final List<OrderObserver> observers;
    private String status;

    public Order(){
        this.observers = new ArrayList<>();
    }
    @Override
    public void register(OrderObserver observer) {
        observers.add(observer);
    }

    @Override
    public void remove(OrderObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(OrderObserver observer : observers){
            observer.update(status);
        }
    }
    @Override
    public void setStatus(String status){
        this.status = status;
        notifyObservers();
    }
}
