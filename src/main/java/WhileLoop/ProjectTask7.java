package WhileLoop;

import java.util.Scanner;

public class ProjectTask7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while (n <= 0) {
            System.out.println("Please enter a positive number.");
            System.out.println("Please enter one time.");
            n = scanner.nextInt();
        }
        scanner.close();
        int sumOfEven = 0;
        int i = 1;
        while (i <= n) {
            if (i % 2 == 0) {
                sumOfEven += i;
                System.out.print(i + " ");
            }
            i++;
        }
        System.out.println();
        System.out.println("Sum of even number from 1 to " + n + " : " + sumOfEven);
    }
}
