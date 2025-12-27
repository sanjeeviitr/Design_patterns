package org.example.Factory;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class VehicleFactory {

    private static final Map<VehicleType, Supplier<Vehicle>> registry = new HashMap<>();

    static {
        registry.put(VehicleType.CAR, Car::new);
        registry.put(VehicleType.BIKE, Bike::new);
    }

    public Vehicle createVehicle(VehicleType type){
        Supplier<Vehicle> supplier = registry.get(type);
        if(supplier == null) {
            throw new IllegalArgumentException("Vehicle Type not supported");
        }
        return supplier.get();
    }
}
