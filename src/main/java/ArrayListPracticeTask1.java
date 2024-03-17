import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPracticeTask1 {
    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>(Arrays.asList(5, 6, 7, 8, 9, 10));
        //  System.out.println(integerArrayList.size());
        ArrayList<Integer> lists = new ArrayList<>();
        for (int i = 5; i <= 10; i++) {
            lists.add(i);
        }
        System.out.println(lists.size());
        System.out.println(lists);

        ArrayList<String> games = new ArrayList<>();
        games.add("football");
        games.add("basketball");
        games.add("tennis");
        ArrayList<String> stars = new ArrayList<>();
        stars.add("Lebron James");
        stars.add("Messi");
        stars.add("Jordan");
        games.addAll(stars);
        System.out.println(games);
        System.out.println("--------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter word");
        String userInput = scanner.nextLine();
        char[] letters = userInput.toCharArray();
        ArrayList<Character> arrayList = new ArrayList<>();
        for (int i = 0; i < letters.length; i++) {
            arrayList.add(letters[i]);
        }
        System.out.println(arrayList.contains('a'));



        ArrayList<String> words = new ArrayList<>();

        String temp = "";
        for (int j = 0; j < 5; j++) {
            System.out.println("please enter words " + j);
            words.add(scanner.nextLine());
        }
        System.out.println("Which word u like to replace ");
        String wordToBeReplaced = scanner.nextLine();
        System.out.println("Please enter the new word to replace with");
        String newWord = scanner.nextLine();

        int indexOfOld = words.indexOf(wordToBeReplaced);
        words.set(indexOfOld, newWord);
        System.out.println(words);





    }
}
