package org.example.qtrtest.qtrtest;

public class FlyingCar extends Vehicle implements Flyable, Driveable {
    public FlyingCar(String name) {
        super(name);
    }

    public FlyingCar(String name, int speed, float price, Engine engine) {
        super(name, speed, price, engine);
    }

    @Override
    public boolean transportPassengers() {
        return false;
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
