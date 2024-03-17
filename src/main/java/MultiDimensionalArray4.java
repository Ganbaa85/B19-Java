import java.util.Arrays;

public class MultiDimensionalArray4 {
    public static void main(String[] args) {
        String[] myArr = new String[]{"bananas", "apples", "kiwis"};
        Arrays.sort(myArr);
        System.out.println(Arrays.toString(myArr));
        int[] myArrays = new int[]{2, 3, 0, 1, 9, 7};
        Arrays.sort(myArrays);
        System.out.println(Arrays.binarySearch(myArrays, 7));

        int[] array = new int[]{3, 5, 0, 4,};
        int n = array.length;   //n=4
        for (int i = 0; i < n / 2; i++) {
            int temp = array[i];
            array[i] = array[n - 1 - i];
            array[n - 1 - i] = temp;
            /* first iteration
             * n = 4;
             * i < 2
             * temp = 3
             * second iteration
             * n =  4
             * i < 2;1 < 2
             * temp = 5
             */

            int[] arr1 = new int[]{11, 22, 33};
            int[] arr2 = new int[3];
            for (int j = 0; j < arr1.length; j++) {
                arr2[j] = arr1[arr1.length - 1 - j];
            }
            System.out.println(Arrays.toString(arr2));


        }


    }
}
