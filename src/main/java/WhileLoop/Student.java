package WhileLoop;

public class Student {
    // static variables
    static int totalStudents = 0;

    static int getTotalStudents() {
        return totalStudents;
    }
    static int increaseTotalStudent(int numberOfStudents){
        return totalStudents += numberOfStudents;
    }

    // instance variables
    String fullName;
    double gpa;
    String level;
    String major;

    // instance methods
    String getFullName() {
        return fullName;
    }

    double getGpa() {
        return gpa;
    }

    String getLevel() {
        return level;
    }

    String getMajor() {
        return major;
    }

    // void method - no return type
    void printFullName() {
        System.out.println("The full name of student is: " + fullName);
    }

    void printGpa() {
        System.out.println("Student :" + fullName + " gpa is " + gpa);
    }

    void printClassification() {
        System.out.println("Classification of student :" + fullName + " is " + level);
    }

    void printStudentMajor() {
        System.out.println("Major of the student :" + fullName + "'s major is " + major);
    }

    void printStudentDetails() {
        printFullName();
        printGpa();
        printClassification();
        printStudentMajor();
    }

    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        Student.increaseTotalStudent(2);
        System.out.println(Student.totalStudents);

        student1.fullName = "Ganbaatar Jargal";
        student1.gpa = 3.5;
        student1.level = "Freshman";
        student1.major = "Software Engineer";

        student1.printFullName();
        student1.printGpa();
        student1.printClassification();
        student1.printStudentMajor();
        System.out.println("------------------");



        student2.fullName = "Bob John";
        student2.gpa = 3.7;
        student2.level = "Senior";
        student2.major = "Lawyer";
        student2.printStudentDetails();

        int num = Student.getTotalStudents();
        System.out.println("Total number of students " + num);
        System.out.println("------------------");
        String student1FullName = student1.getFullName();
        System.out.println(student1FullName);

        double student1Gpa = student1.getGpa();
        System.out.println(student1Gpa);


    }


}
