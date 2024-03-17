import java.util.Scanner;

public class ArrayPractice7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a word");
        String userWord = scanner.nextLine();
        char[] letters = userWord.toCharArray();
        int counter = 0;
        for (int i = 0; i < userWord.length(); i++) {
            if (letters[i] == 'a') {
                counter++;
            }
        }
        System.out.println("Letter 'a' appeared " + counter);
    }
}
