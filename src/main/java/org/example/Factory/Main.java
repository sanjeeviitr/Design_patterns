package org.example.Factory;

public class Main {

    public static void main(String[] args) {

//        Factory Pattern encapsulates object creation logic and allows objects to be created at runtime without exposing the creation details to the client. This helps decouple the client from concrete implementations and prevents changes in object creation from affecting client code.
//
        VehicleFactory factory = new VehicleFactory();
        Vehicle v1 = factory.createVehicle(VehicleType.CAR);
        v1.start();
    }
}
