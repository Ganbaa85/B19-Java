import java.util.HashSet;
import java.util.Scanner;

public class HashSetTask {
    public static void main(String[] args) {
        HashSet<String> stringHashSet = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        for (int j = 0; j < 2; j++) {
            System.out.println("please enter words " + j);
            stringHashSet.add(scanner.nextLine());
        }
        System.out.println("Which word u like to replace " + stringHashSet);
        String wordToBeReplaced = scanner.nextLine();
        System.out.println("Please enter the new word to replace with");
        String newWord = scanner.nextLine();
        stringHashSet.remove(wordToBeReplaced);
        stringHashSet.add(newWord);
        System.out.println("Replaced words are " + stringHashSet);

    }
}
