public class EnhancedForLoop {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5};
        for (int number : array) {
            System.out.println(number);
        }
        long[] arrayOfLong = new long[]{100000L, 200000L, 300000L};
        for (long num : arrayOfLong) {
            System.out.println(num);
        }
        String[] words = new String[]{"earth", "moon", "sun", "planet", "saturn"};
        for (String word : words) {
            System.out.println(word);

        }
        char[] letters = "encyclopedia".toCharArray();
        System.out.println(letters.length);
        for (char letter : letters) {
            if (letter == 'l')
               break;
            System.out.println(letter);


        }

        int[] arr1 = new int[]{11,22,33,44};
        for (int number : arr1){
            if (number==33){
                continue;
            }else {
                System.out.println(number);
            }
        }




    }
}
