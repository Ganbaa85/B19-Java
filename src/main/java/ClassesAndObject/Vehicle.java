package ClassesAndObject;

public class Vehicle {

    Vehicle(){

    }
    int vehicleMakeYear;
    String brand;
    String model;
    Vehicle(String brand){

    }
    Vehicle (int vehicleMakeYear,String brand,String model){
        this.vehicleMakeYear = vehicleMakeYear;
        this.brand = brand;
        this.model = model;
    }

    public Vehicle(int vehicleMakeYear) {
        this.vehicleMakeYear = vehicleMakeYear;
    }


    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(); // no- args
        vehicle.vehicleMakeYear = 1999;
        vehicle.brand = "Mercedes";
        vehicle.model = "G - Class";

        Vehicle vehicle1 = new Vehicle("Toyota"); // parameter constructor

        Vehicle vehicle2 = new Vehicle(2000,"Honda","Accord");

        System.out.println(vehicle.brand);
        System.out.println(vehicle2.vehicleMakeYear+ vehicle2.brand+vehicle2.model);

    }
}
