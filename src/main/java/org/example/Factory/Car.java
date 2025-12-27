package org.example.Factory;

public class Car implements Vehicle{
    @Override
    public void start() {
        System.out.println("Car starts");
    }
}
