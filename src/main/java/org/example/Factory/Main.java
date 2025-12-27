package org.example.Factory;

public class Main {

    public static void main(String[] args) {

        VehicleFactory factory = new VehicleFactory();
        Vehicle v1 = factory.createVehicle(VehicleType.CAR);
        v1.start();

    }
}
