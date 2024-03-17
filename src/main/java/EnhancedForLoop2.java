import java.util.Scanner;

public class EnhancedForLoop2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the sentnce:");
        String sentence = scanner.nextLine();
        for (String word : sentence.split(" ")) {
            System.out.println(word);
        }
    }
}
