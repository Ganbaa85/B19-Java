import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
       /* boolean isThirtsy = false;
        if (isThirtsy) {
            System.out.println("Drinking water: ");

        }
        int temp = 36;
        if (temp > 50) {
            System.out.println("Wear the jacket:");
        }
        if (temp < 50) {
            System.out.println("Wear light jacket:");
        }
        // and (&)
        boolean isSunny = true;
        boolean isRaining = true;
        if (isSunny & isRaining) {
            System.out.println("it is sunny and raining");
        }
        System.out.println("_______________________________");*/
        Scanner scanner = new Scanner(System.in);
       /* System.out.println("Please enter number(positive or negative): ");
        int number = scanner.nextInt();
        if (number > 0)
        {
            System.out.println(number + " Positive");
        }
        if (number < 0)
        {
            System.out.println(number + " Negative");
        }
        if (number == 0)
        {
            System.out.println(number + " is zero");
        }*/
       /* System.out.println("___________________________________");
        System.out.println("Please enter yout age: ");
        int age = scanner.nextInt();
        System.out.println(" are u citizen? ");
        boolean isCitizen = scanner.nextBoolean();
        if (age >=18&&isCitizen){
            System.out.println("u ok");}*/

        //    System.out.println("Please enter your grade (0 to 100): ");
        //  int grade = scanner.nextInt();
        //if (grade >=90 & grade <=100) {
        //  System.out.println(" A: You're doing great ");
        // }
        // if (grade >=80 & grade <=89) {
        //        System.out.println("B: You're ok ");
        //  }
        // if (grade>=70 & grade <=79){
        //     System.out.println("C: Need more practice ");}
        // if (grade >=0 & grade<=69){
        //     System.out.println("F: You are still suck ");}

        // System.out.println("please enter today's temp (fahrenheit)");
        //int temp = scanner.nextInt();
        // System.out.println((temp-32)*5/9 +" is today's tempreture is(by celsius )"); */

        String a = "its hot";
        int result = a.equals("hello") ? 2 :3;
        System.out.println(result);

        //   boolean isRaining = true;
        //  if (isRaining ){
        //      System.out.println("Get umbrella: ");
        //    }else {
        //      System.out.println("No need umbrella: ");}


      /*  System.out.println("Please enter any number: ");
        int number = scanner.nextInt();
        if (number > 10 ) {
            System.out.println(number + 2);
        }else  {
            System.out.println(number -2);} */


    /*    System.out.println("Please enter your username ");
        String username = scanner.nextLine();
        System.out.println("now enter password ");
        String password  =scanner.nextLine();

        if (username.equals("admin")) {
            System.out.println("good user name");
        }

        if (password.equals("password123") ){
            System.out.println("good job");}
        else System.out.println("access denied"); */

     /*   System.out.println("What was the speed limit? ");
        int speedLimit = scanner.nextInt();
        System.out.println("Is this your first time? ");
        boolean first = scanner.nextBoolean();
        if (speedLimit > 30 && first == true) {
            System.out.println("u get ticket");


        } else
            System.out.println(" u lucky"); */


     /*   System.out.println("Please enter the amount of products u have ");
        int amount = scanner.nextInt();
        System.out.println("enter the promocode ");
        String promocode = scanner.next();

        if (amount>5 && promocode.equals("blackfriday10")) {
            System.out.println("eligible");
        }else System.out.println("not eligible");  */




        System.out.println("Enter your weight: ");
        int weight = scanner.nextInt();
       // System.out.println("Enter your the cost ");
        int cost = 0;
        System.out.println("Enter the distance ");
        int distance = scanner.nextInt();
        if (weight <= 5){cost = 5;}
        else if (weight <= 20 && weight > 5) { cost=10;}
        else cost = 15;
        if (distance <= 0) {
            System.out.println("invalid input: ");}


        else  {if (distance >= 500) {cost += 5;}
        System.out.println("Your price is: " + cost );






        }


    }}






















































