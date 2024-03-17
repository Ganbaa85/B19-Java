package ClassesAndObject;

public class Manager extends Employee{
    public int numberOFEmployeesManaged;
    public void work(){
        System.out.println("employee "+ fullName );

    }

    public static void main(String[] args) {
        Train train=new Train("Titanic",200,5);
        train.blowHorn();
    }

}
