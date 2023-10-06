package org.example.qtrtest.qtrtest;

public class Plane extends Vehicle implements Flyable{
    public Plane(String name) {
        super(name);
    }

    public Plane(String name, int speed, float price, Engine engine) {
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
    public boolean transportPassengers() {
        return false;
    }
}
