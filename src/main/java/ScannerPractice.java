import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // We created an object of Scanner class
        //Scanner.close(); This is how you close it
        // byte - nextByte()
        // short - nextShort()
        // int - nextInt()
        // boolean - nextBoolean()
        // String - next() and nextLine()
//        System.out.println("Please input a byte: ");
//        byte myByte = scanner.nextByte();
//        System.out.println("My byte is: " + myByte);
//        // short - nextShort()
//        System.out.println("PLease input an short: ");
//        short myShort = scanner.nextShort();
//        System.out.println("My short is: " + myShort);
//        // int - nextInt()
//        System.out.println("Please input a integer: ");
//        int myInt = scanner.nextInt();
//        System.out.println("My integer is: " + myInt);
//        // boolean - nextBoolean()
//        System.out.println("Please input a boolean(true/false); ");
//        boolean myboolean = scanner.nextBoolean();
//        System.out.println("My boolean is: " + myboolean);
//        // double - nextDouble()
//        System.out.println("Please input a double: ");
//        double mydouble = scanner.nextDouble();
//        System.out.println("My double is: " + mydouble);
//        // float - nextFloat()
//        System.out.println("PLease input a float: ");
//        float myfloat = scanner.nextFloat();
//        System.out.println("My float is: " + myfloat);
//        // long - nextLong()
//        System.out.println("Please input a long ");
//        long myLong = scanner.nextLong();
//        System.out.println("My long is: " + myLong);
        // String - next() - reads until first space
       System.out.println("Please enter a String: ");
        String myString = scanner.next();System.out.println("My string is: " + myString);
       // String _ nextLine()
        System.out.println("PLease input a sentence ");
        scanner.nextLine();
        String mySentence = scanner.nextLine();
        System.out.println("My sentence is: " + mySentence);
















        scanner.close();







   }
}
