package WhileLoop;

import java.util.Scanner;

public class ForLoopPractice3 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("hi");
        }
        System.out.println("Confirm account 10 times");
        Scanner scanner=new Scanner(System.in);
        for (int i = 0; i < 10; ) {
            String input = scanner.nextLine();
            if (input.equals("delete")){
                i++;
            }
        }
    }
}
