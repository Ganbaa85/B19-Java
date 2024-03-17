import java.util.Arrays;

public class MultiDimensionalArray3 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 5, 2, 8, 9, 3, 7,};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.binarySearch(array, 9));
        int[] b = new int[]{1, 2, 3};
        int[] c = new int[]{1, 2, 4};
        System.out.println(Arrays.equals(b, c));
    }
}
