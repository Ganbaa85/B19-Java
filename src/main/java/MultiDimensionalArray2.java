import java.util.Arrays;

public class MultiDimensionalArray2 {
    public static void main(String[] args) {
        String[][] names = new String[][]{
                {"Bob", "Charlie", "Alice"},
                {"John", "Gary", "Alex", "Robert"},
                {"Diana", "Sandy", "Ray", "David"}
        };
        String[] names1 = new String[11];
        int index = 0;
        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names[i].length; j++) {
                names1[index++] = names[i][j];
            }System.out.println(Arrays.toString(names1));
        }

    }
}
