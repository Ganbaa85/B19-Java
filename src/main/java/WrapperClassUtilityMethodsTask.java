import java.util.Scanner;

public class WrapperClassUtilityMethodsTask {
    public static void main(String[] args) {
        String random = "abc189xyz234pyt567";
        int sum = 0;
        for (int i = 0; i < random.length(); i++) {
            char character = random.charAt(i);          // this will give us a char at certain index
            if (Character.isDigit(character)) {
                String str = String.valueOf(character); // 1 will be converted to String '1'
                int num = Integer.parseInt(str);        // "1" will be parsed to int
                sum += num;                             // sum = sum + 1;
            }
        }
        System.out.println(sum);

        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        String onlyLetter = "";
        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 0; i < userInput.length(); i++) {
            char character = userInput.charAt(i);
            if (Character.isLetter(character)) {
                onlyLetter += String.valueOf(character);
            } else if (Character.isDigit(character)) {
                int digit = Integer.parseInt(String.valueOf(character));
                if (digit % 2 == 0) {
                    sumEven += digit;
                } else {
                    sumOdd += digit;
                }
            }
        }
        System.out.println("only letters " + onlyLetter);
        System.out.println("sum of even " + sumEven);
        System.out.println("sum of odd " + sumOdd);


    }
}
