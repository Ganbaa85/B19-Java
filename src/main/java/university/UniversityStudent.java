package university;

import java.util.ArrayList;
import java.util.Arrays;

public class UniversityStudent {
    public UniversityStudent(String fullName, Address address, ArrayList<Course> courses) {
        this.fullName = fullName;
        this.address = address;
        this.courses = courses;
    }

    public String fullName;

    public Address getAddress() {
        return address;
    }

    private Address address;
    public ArrayList<Course> courses;
    @Override
    public String toString(){
        return fullName+ "'s address is "+ this.address.getStreet()+ this.address.getCity()+
                "and studying courses "+ this.courses.get(0);
    }

    public static void main(String[] args) {
        Address studentAddress = new Address("2400 N lincoln ave", " Chicago ", 60089, "IL", 999);
        ArrayList<Course> courses = new ArrayList<>();
        Course historyCourse = new Course("Science", "Neil deGrasse", 90);
        Course geometryCourse = new Course("Geometry", "John", 60);
        courses.add(historyCourse);
        courses.add(geometryCourse);
        UniversityStudent universityStudent = new UniversityStudent("Ganbaatar Jargal",studentAddress,courses);
        System.out.println(universityStudent);

    }



}
