import java.util.Scanner;

public class SwitchStatementPractice {
    public static void main(String[] args) {

        int a = 2;
        switch (a) {
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            default:
                System.out.println("Not ");
        }
        String name = "Harry Potter";
        switch (name) {
            case "Dart Vader":
                System.out.println("Star Wars");
                break;
            case "Harry Potter":
                System.out.println("Harry Potter");
                System.out.println("Dumbledore");
                break;
            default:
                System.out.println("Unknown movie");
                break;

        }

        String makeOFCar = "Tesla";
        String modelOfCar = "Model X";
        switch (makeOFCar) {
            case "Honda":
                switch (modelOfCar) {
                    case "Accord":
                        System.out.println("Honda Accord");
                        break;
                    case "Civic":
                        System.out.println("Honda Civic");
                        break;
                }
                break;
            case "Tesla":
                switch (modelOfCar) {
                    case "Model Y":
                        System.out.println("Tesla Model Y");
                        break;
                    case "Model X":
                        System.out.println("Tesla Model X");
                        break;
                    case "CyberTruck":
                        System.out.println("Tesla CyberTruck");
                }
                break;
            default:
                System.out.println("Not in there");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the day");
        String day = scanner.next();
        String firstLetter = day.charAt(0) + "";
        String updatedDay = firstLetter.toUpperCase() + day.substring(1);
        switch (updatedDay) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                System.out.println("This is work day");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("it is weekend");
                break;
            default:
                System.out.println("invalid entry");
                break;

        }

        System.out.println("Enter first numbers");
        int first = scanner.nextInt();
        System.out.println("enter second number");
        int second = scanner.nextInt();
        System.out.println("enter operator");
        String operator = scanner.next();
        switch (operator) {
            case "+":
                System.out.println(first + second);
                break;
            case "-":
                System.out.println(first - second);
                break;
            case "*":
                System.out.println(first * second);
                break;
            case "/":
                if (second == 0) {
                    System.out.println("not allowed");
                } else {
                    System.out.println(first / second);
                }
            default:
                System.out.println("try again");
                break;
        }


    }
}
