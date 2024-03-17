public class ArithmethicOperations {
    public static void main(String[] args) {
         int totalNumberOfTables = 60;
         int totalNumberOfClasses = 6;
        int perTablesPerClasses = (totalNumberOfTables  /  totalNumberOfClasses);
        System.out.println(perTablesPerClasses);
         int num1 = 5;
         int num2  = 2;
         int result = num1 / num2;
        System.out.println(result);




        double first = 7;
        double second = 2;
        double result1 = first / second;
        System.out.println(result1);

        float priceOfCar = 238358.76f;
        float numberOfBuyer = 2.0f;
        float pricePerBuyer = priceOfCar / numberOfBuyer;
        System.out.println(pricePerBuyer);

        double priceOfHouse = 1234567.56;
        double months = 36;
        System.out.println(priceOfHouse / months);
        System.out.println("----------------------------------");

        /*
        4. Remainder/modulus [ % ]
         */

        int firstNum = 5;
        int secondNum = 2;
        int remainder = 5 % 2;
        System.out.println(remainder);
        int someNum1 = 10;
        int someNum2 = 5;
        System.out.println(10 % 5);

        /*
        1.TAKE THE NUMBER ONE BY ONE
        2.FIND THE MODULUS BY DIVIDING IT BY 2
        3.IF NO REMAINDER ,THE NUMBER IS EVEN,OTHERWISE IT'S NOT.

         */
         // 1.Find the even/odd numbers within a given array of integers.


        System.out.println("------------------PRECEDENCE----------------------" );

        int result2 = 2 + 3 * 4; //Multiplication (4*3) will be performed first,then addition will happen
        System.out.println(result2);

        int result4 = 10 - 6 / 2; // Division will be performed first,and then subtraction
        System.out.println(result4);

        int result5 = 11 + 5 % 2; // Remainder performed first(5 % 2),and then addition (11 + 1)
        System.out.println(result5);

        int result6 = 2 * 3 * 4; // 2 * 3 is evaluated ,6 * 4 is calculated next
        // if operators are same level calculation performed from left to right
        System.out.println(result6);

        int result7 = 20 - 5 + 3; // plus and minus are same level of precedence
        System.out.println(result7);

        int result8 = 10 / 2 % 3; // division and modulus are the same level of precedence
        // 10 / 2 is first,5 % 3 is second
        System.out.println(result8);

        int result9 = 10 / (  2 % 3  ); // 2 % 3 is first in calculate, division performed second
        System.out.println(result9 +"dddd");

        int result10 = 20 - (5 + 3);
        System.out.println(result10);

        int result11 = 2 + (3 * 4 - 2) / 2;  // () parentheses
        // 3 * 4
        // 12 - 2
        // 10 / 2
        // 5 + 2
        // 7
        System.out.println(result11);
        int result14 = 4 + 3 * 2 - 1/2%3;
        System.out.println(result14);







    }
}
