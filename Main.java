package org.example.qtrtest.qtrtest;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("BMW");
        Vehicle plane = new Plane("Mustang");
        Vehicle boat = new Boat("Boat");
        Vehicle truck = new Truck("Truck");
        Drone drone = new Drone("Drone");

        Vehicle flyingCar = new FlyingCar("Infinity");

        ArrayList<Vehicle> names = new ArrayList<>();
        names.add(car);
        names.add(plane);
        names.add(boat);
        names.add(truck);


//        for(Vehicle l: names){
//            System.out.println(names);
//        }


        FlyingCar flyingCar1 = new FlyingCar("Fly");

        System.out.println(names);

        ArrayList<Vehicle> flyables = new ArrayList<>();
        flyables.add(flyingCar);
       // flyables.add(drone);
        flyables.add(plane);




    }
}
