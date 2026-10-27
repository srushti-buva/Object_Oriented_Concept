package com.tka.vehicle;

public class Vehicle {
	String vehicleName;
    String vehicleType;
    int modelYear;
    int wheels;
    double price;

    public static void engineWorking() {
        System.out.println("Engine is Working");
    }

    public static void fuel() {
        System.out.println("Vehicle needs Fuel");
    }

    public static void insurance() {
        System.out.println("Vehicle Insurance Details");
    }

    public void display() {

        System.out.println("Vehicle Name --> " + vehicleName);
        System.out.println("Vehicle Type --> " + vehicleType);
        System.out.println("Model Year --> " + modelYear);
        System.out.println("Wheels --> " + wheels);
        System.out.println("Price --> " + price);

        engineWorking();
        fuel();
        insurance();
    }

}
