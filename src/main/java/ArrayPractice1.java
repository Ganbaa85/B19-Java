import java.util.Arrays;

public class ArrayPractice1 {
    public static void main(String[] args) {
        double[] prices = new double[4];
        prices[0] = 1.99;
        prices[1] = 109.99;
        prices[2] = 5;
        prices[3] = 10005;
        for (int i = 0; i < prices.length; i++) {
            System.out.println(prices[i]);
        }
        char[] alphabet = new char[26];
        int index = 0;
        for (int i = 'A'; i <= 'Z'; i++) {
            alphabet[index] = (char) i;
            System.out.println(alphabet[index]);
            index++;
        }
        System.out.println(Arrays.toString(alphabet));


    }

}


