import java.util.Scanner;

public class NestedIfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter your subject: ");
//        String subject = scanner.next();
//        System.out.println("Enter your grade: ");
//        String grade = scanner.next();
//        if (subject.equalsIgnoreCase("Science")) {
//            if (grade.equalsIgnoreCase("A") || grade.equalsIgnoreCase("B")) {
//            System.out.println("Biology or Chemistry");
//        } else {
//            System.out.println("Physics and eart science");
//           }
//        } else if (subject.equalsIgnoreCase("math")) {
//            if (grade.equalsIgnoreCase("A") || grade.equalsIgnoreCase("B"))
//
//
//        }

        System.out.println("Select the option(check balance,deposit,withdraw): ");
        String customer = scanner.nextLine();
        int balance = 100;

        if (customer.equalsIgnoreCase("check balance")) {
            System.out.println(balance + " your balance ");

        } else if (customer.equalsIgnoreCase("deposit")) {
            System.out.println("dep amount");
            int amount = scanner.nextInt();
            if (amount > 0) {
                balance = balance + amount;
                System.out.println(balance + " New balance");
            } else {
                System.out.println("invalid deposit ");

            }
        } else if (customer.equalsIgnoreCase("withdraw")) {
            System.out.println("enter withdraw amount: ");
            int withdraw = scanner.nextInt();
            if (withdraw < balance && withdraw > 0) {
                balance = balance - withdraw;
                System.out.println(balance + " withdraw good ");
            } else System.out.println("invalid withdraw");

        } else {
            System.out.println("action is invalid ");
        }


    }
}