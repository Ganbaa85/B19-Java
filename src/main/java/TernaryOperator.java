import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int max = (a > b ) ? a : b;
        System.out.println(max);

        double c = 10.0;
        double d = 15.5;
        double e = (c == d) ? d : c;

        //char
        int q = 2;
        int w = 3;
        char letter = (q > w) ? 'a' : 'b';
        System.out.println(letter);
        //string
        String str = "hello";
        String str1 = (str.equals("bye")) ? "abc" : "xyz";
        System.out.println(str1);
        String str2 = (str.isEmpty()) ? "Chicago" : "New York";
        System.out.println(str2);
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your grade ");
        int userGrade = scanner.nextInt();
        String finalGrade = (userGrade >= 75) ? "Passed" : "Failed";
        System.out.println(finalGrade);
        System.out.println("enter any number");
        int userNum = scanner.nextInt();
        System.out.println("enter second number");
        int userNum2 = scanner.nextInt();
       String finalresult = (userNum < userNum2) ? "first is small" : (userNum == userNum2) ? "equal"  : "second is small";
        System.out.println(finalresult);















    }
}
