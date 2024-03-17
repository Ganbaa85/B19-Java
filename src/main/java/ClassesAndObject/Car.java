package ClassesAndObject;

public class Car {
    static int totalCars = 0;

    String make;
    String model;
    String color;
    int yearMake;

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.make = "Toyota";
        car1.model = "Camry";
        car1.color = "White";
        car1.yearMake = 2024;

        System.out.println(Car.totalCars); // static field
        System.out.println(car1.make +", "+ car1.model + ", " + car1.color + ", " + car1.yearMake);


    }
}
