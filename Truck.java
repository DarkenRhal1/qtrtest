package org.example.qtrtest.qtrtest;

public class Truck extends Vehicle implements Driveable{
    public Truck(String name) {
        super(name);
    }

    public Truck(String name, int speed, float price, Engine engine) {
        super(name, speed, price, engine);
    }

    @Override
    public void printVehicleType() {

    }

    @Override
    public float getPriceAfterDiscount() {
        return 0;
    }

    @Override
    public void printSpeed(Vehicle vehicle) {

    }
}
