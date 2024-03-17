import java.util.Scanner;

public class ArrayPractice5 {
    public static void main(String[] args) {
        String[] words = {"apple", "pears", "bananas", "peaches", "kiwi", "tomato", "pepper"};
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
        System.out.println("_____________");
        for (int j = 0; j < words.length; j++) {
            if (j % 2 == 0 && j != 0) {
                System.out.println(words[j]);
            }
        }
        Scanner scanner = new Scanner(System.in);
        String[] colors = new String[3];
        for (int i = 0; i < colors.length; i++) {
            System.out.println("please enter the colors: ");
            colors[i] = scanner.next();
        }
        String leastCharColors = colors[0];
        for (int j = 0; j < colors.length; j++) {
            if (leastCharColors.length() > colors[j].length()) {
                leastCharColors = colors[j];
            }
        }
        System.out.println("least Char color is: " + leastCharColors);


    }
}
