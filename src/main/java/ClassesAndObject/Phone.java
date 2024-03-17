package ClassesAndObject;

public class Phone {
    String zipCode;
    {
        zipCode = "+1";
    }
    public  Phone(String areaCode, String phoneNumber){
        System.out.println(zipCode + " "+ areaCode+ " "+ phoneNumber);
    }

    public static void main(String[] args) {
        Phone usPhone = new Phone("773","111-2222");
    }
}
