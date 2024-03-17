public class CastingInJava {
    public static void main(String[] args) {
    //Casting is the process of canverting one data type to another
    //Casting includes Upcasting and Downcasting
    //Upcasting/ Implicit
    byte a = 1;
    short b = (short) a;
    int c = b;
    long d = c;

    //Downcasting/Explicit
    long number = 10L;
    int myCastednum = (int) number; // we're downcasting the number to integer,and assigning to myCastednum.
    short shortNum = (short) number;

        //Numeric Promotion
    // Any arithmetic operations with byte ,short will result in int.

    byte mybyte3 = 1;
    int result = mybyte3 + 1;

    //instanceof

    int num2 = 5;
    double num3 = 1.5;
    // num2 / num3 ---> result will be double
    double myResult = num2 / num3;
        System.out.println(myResult);
        System.out.println("----------------------------------------");

        // byte promoted to Long

        char letter = 'a';    //Java will take it from Ascii Table
        short myshort1 = 5;
        int result16 = letter + myshort1; // 97 + 5
        System.out.println(result16);

        char letter2 = 'c'; //ASCII table value: 99
        char letter3 = 'R';  //ASCII table value:82
        System.out.println(letter2 + letter3);


        float muFloat1 = 2.5f;
        double myDouble1 = 5.0;
        double result17 = myDouble1 + muFloat1;
        System.out.println(result17);

        int myInt1 = 2;
        float myFloat2 = 3.6f;
        float result18 = myInt1 + myFloat2;
        System.out.println(result18);

        double myDouble3 = 5.5;
        long myLong2 = 10L;
        double result19 = myDouble3 + myLong2;
        System.out.println(result19);

        float myFloat4 = 2.5f;
        long myLong4 = 10L;
        float result20 = myFloat4 + myLong4;
        System.out.println(result20);
        System.out.println("_____________________________________");

        int firstLetter = 'G';
        int secondLetter = 'a';
        int thirdLetter = 'n';

        System.out.println(firstLetter);
        System.out.println(secondLetter);
        System.out.println(thirdLetter);

        int lastName = 'J';
        int lastName1 = 'a';
        int lastName2 = 'r';

        System.out.println(lastName);
        System.out.println(lastName1);
        System.out.println(lastName2);




    }
}
