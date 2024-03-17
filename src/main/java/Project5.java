import java.util.Scanner;

public class Project5 {
    public static void main(String[] args) {
//        String input = "happy";
//        String newstr = "";
//        int lastChar = input.length() - 1;
//        while (lastChar >= 0) {
//            newstr += input.charAt(lastChar);
//            lastChar--;
//
//        }
//        System.out.println(newstr);
        Scanner scanner = new Scanner(System.in);
//        System.out.println("pleasen enter the max number");
//
//        int max = scanner.nextInt();
//        System.out.println("please enter min number");
//        int min = scanner.nextInt();
//        int sum = 0;
//        for (int i = min; i <= max; i++)
//            if (i % 3 == 0 && i % 11 == 0) {
//                sum += i;
//                System.out.println(i);
//                System.out.println(sum);
//            }

        int number = scanner.nextInt();
        for (int i = number; i >= 1; i--) { // i = 3 // i > 1 true

            for (int j = 1; j <= i; j++){ //j = 1 < 3 true

                System.out.print(i); // 333
                //
            }
            System.out.println();
        }





    }

}
