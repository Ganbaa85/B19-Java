package ClassesAndObject;

public class Person {
    private Person person;

    Person() { // NO-args constructor
    }

    private String fullName;

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    private int age;


    public void setFullName(String fullName) {
        if (fullName == null || fullName.isBlank() || fullName.isEmpty()) {
            System.out.println("Invalid name !!");
            return;
        }
        boolean allCharsDigits = true;
        for (int i = 0; i < fullName.length(); i++) {
            if (Character.isLetter(fullName.charAt(i))) {
                allCharsDigits = false;

            }
        }
        if (allCharsDigits) {
            System.out.println("Name cannot have digits");
            return;
        }

        this.fullName = fullName;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("invalid age ");
            return;
        }
        this.age = age;
    }

    String address;


    // 1 agrs constructor
    Person(String fullName) {
        this.fullName = fullName;
    }

    // 3 args constructor
    public Person(String fullName, int age, String address) {
        this.fullName = fullName;
        this.age = age;
        this.address = address;
    }

    /*
    Constructors can be overloaded
    for example:
    Person(){};
    Person(String fullName){this.fullName = fullName}
    Person(String fullName,int age,String address){}
     */
    @Override // an annotaion in java
    public boolean equals(Object object) {
        Person person = (Person) object;
        return this.fullName.equals(person.fullName)
                && this.age == person.age
                && this.address.equals(person.address);

    }

    public static void main(String[] args) { // Java called default constructor
        Person person = new Person();
        person.fullName = "John Wick";
        person.age = 33;
        person.address = "Continental";


        Person person1 = new Person("Ganbaa Jargal"); // Java will call parameterized constructor


        Person person2 = new Person("James Bond", 38, "London, England");

        if (person1.equals(person2)) {
            System.out.println("Two people equals");
        }
        Person a = new Person("Tony Clark", 35, "New York");
        Person b = new Person("Tony Clark", 35, "New York");
        if (a.equals(b)) {
            System.out.println("2 person equal");
        } else {
            System.out.println("2 person not equal");
        }

    }

}
