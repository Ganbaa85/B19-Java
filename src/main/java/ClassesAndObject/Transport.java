package ClassesAndObject;

public class Transport {


    public String name;

    public Transport(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }


    public int capacity;

    public void start(){
        System.out.println(name + " is starting ");

    }
    public void stop(){
        System.out.println(name + " is stopping");
    }


}
