package org.example.Observer;

public interface OrderSubject {
    void register(OrderObserver observer);
    void remove(OrderObserver observer);
    void notifyObservers();
    void setStatus(String status);
}
