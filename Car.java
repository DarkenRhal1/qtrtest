package org.example.qtrtest.qtrtest;

public class Car extends Vehicle implements Driveable{

    private int numberOfDoors;

    private float extraTax = .05f + .10f;
    public Car(String name) {
        super(name);
    }

    public Car(String name, int speed, float price, Engine engine) {
        super(name, speed, price, engine);
    }

    public Car(String name, int numberOfDoors, float extraTax) {
        super(name);
        this.numberOfDoors = numberOfDoors;
        this.extraTax = extraTax;
    }

    public Car(String name, int speed, float price, Engine engine, int numberOfDoors, float extraTax) {
        super(name, speed, price, engine);
        this.numberOfDoors = numberOfDoors;
        this.extraTax = extraTax;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public float getExtraTax() {
        return extraTax;
    }

    public void setExtraTax(float extraTax) {
        this.extraTax = extraTax;
    }

    public void printNumberOfDoors(){

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
