package ClassesAndObject;

public class Laptop implements ElectronicDevices  {

    @Override
    public void turnOn() {
        System.out.println("device turning on");
    }

    @Override
    public void turnOff() {
        System.out.println("device turning off");
    }

    @Override
    public void reset() {
        System.out.println("device resetting");


    }

    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.reset();
        laptop.turnOff();
        laptop.turnOn();
    }
}
