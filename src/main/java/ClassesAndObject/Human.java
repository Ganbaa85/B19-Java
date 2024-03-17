package ClassesAndObject;

public class Human {

    boolean isSmart;
    int age;
    String purpose;  // instance variable

    void walk() {
    }

    String talk() {
        return "Human talk";
    }


    public static void main(String[] args) {

        Human human = new Human();
        human.walk();
        human.talk();
        human.isSmart = true;
        human.purpose = "To create something";
        human.age = 80;
        System.out.println("Is humans Smart " + human.isSmart);
        System.out.println("purpose of being human is " + human.purpose);
        System.out.println("Average life span of human is " + human.age);


    }
}
