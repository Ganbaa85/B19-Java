package ClassesAndObject;

public class Bird implements Flyable,Movable {
    public String name;
    boolean canFly;
    public String carnivore;
     public boolean live(){
        System.out.println("Bird is present");
        return true;
    }


    @Override
    public void fly() {
        System.out.println("flying bird");
    }

    @Override
    public void move() {
        System.out.println(" moving bird");

    }

    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.fly();
        bird.move();
    }
}
