package WhileLoop;

import java.util.Scanner;

public class ForLoopPractice6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input string");
        String temp = "";
        String input = scanner.nextLine();
        for (int i = input.length() - 1; i >= 0; i--) {
            temp += input.charAt(i);

        }
        System.out.println(temp);
        if (input.equalsIgnoreCase(temp)){
            System.out.println("this is Palindrome");
        }else System.out.println("this is Not Palindrome");
    }
}
