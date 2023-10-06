package org.example.qtrtest.qtrtest;

public class Boat extends Vehicle implements Driveable{

    private boolean hasGPS;


    public Boat(String name) {
        super(name);
    }


    public boolean isHasGPS() {
        return hasGPS;
    }

    public Boat(String name, boolean hasGPS) {
        super(name);
        this.hasGPS = hasGPS;
    }

    public Boat(String name, int speed, float price, Engine engine, boolean hasGPS) {
        super(name, speed, price, engine);
        this.hasGPS = hasGPS;
    }

    public void setHasGPS(boolean hasGPS) {
        this.hasGPS = hasGPS;
    }

    public Boat(String name, int speed, float price, Engine engine) {
        super(name, speed, price, engine);
    }

    public void printGpsInfo(){

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
