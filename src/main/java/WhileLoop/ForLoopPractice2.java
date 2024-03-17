package WhileLoop;

import java.util.Scanner;

public class ForLoopPractice2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean passwordMatch = false;
        String password1 = "";
        String password2 = "";

        for (int i = 0; i < 2; i++) {
            System.out.println("Please enter the password");
            if (i == 0) {
                password1 = scanner.nextLine();
            } else if (i == 1) {
                password2 = scanner.nextLine();

            }

        }
        System.out.println("Password matches " + password1.equals(password2));



    }
}
