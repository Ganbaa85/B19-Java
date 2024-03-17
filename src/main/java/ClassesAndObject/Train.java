package ClassesAndObject;

public class Train extends Transport{
    int numOfContainers;

    public Train(String name, int capacity,int numOfContainers) {
        super(name, capacity);   // parent constructor called
        this.numOfContainers = numOfContainers;
    }
    @Override
    public void start(){
        super.start();
        System.out.println("Train is starting ");
        System.out.println(name + " blow its horn");
    }


    public void blowHorn() {
        super.start(); // parent method called
        System.out.println(super.capacity + "is a capacity"); // parent variable is accessed.
        System.out.println(name + " blow its horn");
    }

    public static void main(String[] args) {
        Train train=new Train("Titanic",200,5);
        train.blowHorn();

    }
}
