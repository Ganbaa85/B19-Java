package ClassesAndObject;

public class SubClass extends SuperClass {

    public static void display(){
        System.out.println("display in subclass");
    }

    public static void main(String[] args) {
        SubClass.display();
        SuperClass.display();

    }
}
