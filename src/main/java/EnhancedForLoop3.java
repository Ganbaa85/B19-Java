import java.util.Arrays;
import java.util.Scanner;

public class EnhancedForLoop3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arrayOfNums = new int[5];
        for (int i = 0; i < arrayOfNums.length; i++) {
            System.out.println("PLease enter int 5 times " + i);
            arrayOfNums[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int num : arrayOfNums) {
            sum +=num;

        }
        System.out.println(Arrays.toString(arrayOfNums));
        System.out.println("Sum is: " + sum);
    }
}
