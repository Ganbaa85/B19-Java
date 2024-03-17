package WhileLoop;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
//        int counter = 21;
//        while (counter > 0){
//            if (counter % 2 == 1){
//                System.out.println("odd is "+ counter);
//            }
//            counter--;
//        }
//        String userName = "johndoe";
//        String password = "Password123!";
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter user name ");
//        String enterUser = scanner.next();
//        System.out.println("Enter the password ");
//        String enterPass = scanner.next();
//        int counter = 2;
//        while (!enterUser.equals(userName) && counter > 0 && !enterPass.equals(password)){
//            System.out.println("please try again ");
//            enterUser = scanner.next();
//            System.out.println("please enter password again ");
//            enterPass=scanner.next();
//            counter--;
//        }
//        if (counter >0  && enterUser.equals(userName) && enterPass.equals(password)){
//            System.out.println("successfull");
//        }else {
//            System.out.println("Denied");
//        }
//        System.out.println("Please enter any word");
//        StringBuilder reversed = new StringBuilder(); // Empty
//        String origWord = scanner.nextLine(); //abc
//        int index =origWord.length()-1; // index 2
//        while (index >= 0){
//            char letter = origWord.charAt(index); //abc -- abc.charAt(2) -- c
//                                                  //abc -- abc.charAt(1) -- b
//                                                  //abc -- abc.charAt(0) -- a
//            reversed.append(letter); //cba
//            index--;
//        }
//        System.out.println("orignal string is: " + origWord);
//        System.out.println("your reversed string: " + reversed);
//        System.out.println("please enter word");
//        String word = scanner.nextLine();
//        int counter = 0;
//        int index = 0;
//        while (index < word.length()){
//           if (word.charAt(index)== 'l'){
//               counter++;
//           }
//           index++;
//        }
//        System.out.println("Letter l appears " + counter + " times");
//
//        System.out.println("please enter words now");
//        String word1 = scanner.nextLine();
//        System.out.println("please enter number");
//        int number = scanner.nextInt();
//        while (number>0){
//            System.out.println(word1);
//            number--;
//        }
//        System.out.println("please enter num?");
//        int userInput =scanner.nextInt();
//        int number1 = 1;
//        int sumTotal = 0;
//        while (number1<=userInput){
//            sumTotal = sumTotal * number1;
//            number1++;
//        }
//        System.out.println(sumTotal);
//        System.out.println("please enter any number ");
//        int inputUser = scanner.nextInt();
//        int multiNumber=1;
//        if (inputUser<=0){
//            System.out.println("try again");
//            inputUser=scanner.nextInt();
//        }else {
//            while (inputUser>0){
//                multiNumber *=inputUser;
//                inputUser--;
//            }
//            System.out.println("number is " + multiNumber);
//        }
//        System.out.println("please enter any number for fibonacci ");
//        int count = 0;
//        int num=0;
//        int num1=1;
//        int userFibo =scanner.nextInt();
//        while (count<userFibo){
//            System.out.println(num+", ");
//            int nextNum=num+num1;
//            num=num1;
//            num1=nextNum;
//            count++;
//        }
//       int a=-1;
//        while (a>=0){
//            System.out.println("hello?");
//            a--;
//        }
//        int b = -1;
//        do {
//            System.out.println("hello");
//            b--;
//        }while (b>=0);
//        System.out.println("Please enter positive number ");
//        int userNum=scanner.nextInt();
//        do {
//            System.out.print(userNum+ " ");
//            userNum--;
//        }while (userNum>=0);
//        String password="ganbaa";
//
//        String userpassword;
//        do { System.out.println("enter the password");
//           userpassword=scanner.next();
//
//
//        }while (!userpassword.equals(password));
//        System.out.println(password +" good");
//
//
//        System.out.println("enter number");
//        int num = 1;
//        int userNum=scanner.nextInt();
//        do {
//            if (num%2==0){
//                System.out.print(num + " ");
//
//
//            }num++;
//        }while (num<=userNum);
        System.out.println("number please");
        int userNumber = scanner.nextInt();
        int number = 1;
        do {
            System.out.println(userNumber + " * " + number + " = " + (userNumber * number));
            number++;

        } while (number <= 5);

        System.out.println("enter base number");
        int baseInput = scanner.nextInt(); // 5
        System.out.println("enter ex number");
        int exNum = scanner.nextInt(); // 4
        int total = 1;
        do {
            total *= baseInput; // 5, total =  5 *5 = 25,total = 25 * 5 =125
            exNum--; // 4 --> , 3--
        } while (exNum > 0);
        System.out.println("Total is " + total);
        System.out.println("select the item ");
        int pizza = 1;
        int pasta = 2;
        int chaaseburger = 3;
        int exit = 4;
        int userChoose = scanner.nextInt();
        do {
            if (userChoose == 1) {
                System.out.println("U selected Pizza");


            } else if (userChoose == 2) {
                System.out.println("U selected Pasta");


            } else if (userChoose == 3) {
                System.out.println("u selected cheeseburger");

            } else {
                System.out.println("wrong choice");
                break;
            }
            System.out.println("try again");
            userChoose=scanner.nextInt();
        }
        while (userChoose != 4);
        System.out.println("exit");


    }
}
