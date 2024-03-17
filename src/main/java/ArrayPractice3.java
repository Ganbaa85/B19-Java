public class ArrayPractice3 {
    public static void main(String[] args) {
        int[] numbers = new int[8];
        int[] prices = {323, 44, 2, 65, 67, 78};
        int max = 0;
        int min = prices[0];
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] >max) {
                max = prices[i];
            }
       }
        System.out.println(max); // find the min number home work
        for (int j = 0; j < prices.length; j++) {
            if (prices[j] < min) {
                min = prices[j];
            }
        }
        System.out.println(min);

    }
}
