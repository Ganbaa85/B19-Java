import java.util.Scanner;

public class homeWorkStringMethod {
    public static void main(String[] args) {


//    Scanner scanner =  new Scanner(System.in);
//        System.out.println("Please enter a word: ");
//        String word = scanner.next();
//        System.out.println("Please enter character: ");
//        String character = scanner.next();
//        System.out.println("Result: " + word.contains(character));
//        Scanner scanner1= new Scanner(System.in);
//        System.out.println("Please enter a word: ");
//        String word = scanner1.next(); // read the word and store in word variable
//        System.out.println("Please enter the Ascii value of your character: ");
//        int asciivalue = scanner1.nextInt();// user would input the ascii value
//        char character = (char) asciivalue;// casting integer to character based on ascii
//        System.out.println("Result is: " + word.contains(character+ " "));// print out result
        // edge case is rare case(in testin terminology)

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter a sentence: ");
//        String upperCase = scanner.nextLine();
//        System.out.println("Result : " + upperCase.toUpperCase());
//        System.out.println("Please enter a any 2 letters: ");
//        String STARTSWITH = scanner.nextLine();
//        System.out.println("Word starts with: " + upperCase.startsWith(STARTSWITH));

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter upper cased sentence: ");
//        String lowerCased = scanner.nextLine();
//        System.out.println("Lower cased word is: " + lowerCased.toLowerCase());
//        System.out.println("Please enter any word: ");
//        String anyWord = scanner.nextLine();
//
//        System.out.println("RESULT IS; " + lowerCased.endsWith(anyWord));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a word or sentence: ");
        String newWord = scanner.nextLine();

        System.out.println("Please enter a old character: ");
        String oldChar = scanner.next();
        System.out.println("Please enter char to replace: ");
        String newChar = scanner.next();
        //replace(String oldString, String newString);
        System.out.println("your new word is: " + newWord.replace(oldChar, newChar));


    }
}
