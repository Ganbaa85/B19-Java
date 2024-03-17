public class StringPractice {
    public static void main(String[] args) {

        String myString = "Hello"; // string is created in string pool
        System.out.println(myString);
        String myString2 = new String("hey waz up");
        System.out.println(myString2);
        String myFirstName = "Ganbaatar";
        String myLastName = new String("Jargal");
        System.out.println(myFirstName);
        System.out.println(myLastName);
        // STRING CONCATENTION
        System.out.println(myFirstName + " " + myLastName);
        System.out.println("Ganbaatar" + " Jargal");
        // default value of variable 'word' in NULL
        String number = "1";
        number += "2";
        number += 2;
        System.out.println(number);


    }
}
