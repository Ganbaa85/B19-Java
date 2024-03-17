import java.util.Arrays;

public class ArrayPractice2 {
    public static void main(String[] args) {
        int[] numArray = new int[55];
        // int index = 0;
        for (int i = 0, index = 0; i < 110; i++) {
            if (i % 2 != 0) {
                numArray[index++] = i;
                // index++;
            }
        }
        System.out.println(Arrays.toString(numArray));
        for (int i = numArray.length - 1; i >= 0; i--) {
            System.out.print(numArray[i] + ", ");
        }
        for (int i = 0, sum = 0; i < numArray.length; i++) {
            sum += numArray[i];
            System.out.println(sum);
        }

    }
}