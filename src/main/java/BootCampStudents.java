public class BootCampStudents {



    public BootCampStudents() {
        System.out.println("constructor ");
    }
    int i = 10;
    {
        System.out.println("1 student "+ i);

    }
    int j = 10;
    {
        System.out.println("2 student "+ j);
    }
    int k = 10;
    {
        System.out.println("3 student "+k);

    }

    static {

        System.out.println("static is first and once");
    }


    public static void main(String[] args) {
        BootCampStudents bootCampStudents1 = new BootCampStudents();
        BootCampStudents bootCampStudents2 = new BootCampStudents();
        BootCampStudents bootCampStudents3 = new BootCampStudents();

    }

}
