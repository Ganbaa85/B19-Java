import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice4 {
    public static void main(String[] args) {
        System.out.println("Please enter number of colors: ");
        Scanner scanner = new Scanner(System.in);
        int colorCount = scanner.nextInt();
        System.out.println("U will enter " + colorCount + " Colors");
        String[] colors = new String[colorCount];
        int maxletter = 0;
        int minLetter = 0;
        for (int i = 0; i < colorCount; i++) {
            System.out.println("Please enter color number; " + i);
            String currentColor = scanner.next();
            colors[i] = currentColor;
            if (maxletter < colors[i].length()){
                maxletter = colors[i].length();
            }else if (minLetter > colors[i].length());{
                minLetter = colors[i].length();
            }
        }
        System.out.println("U have entered colors:" + Arrays.toString(colors));
        System.out.println("Maximum letter color is: "+ maxletter );
        System.out.println("Minimum letter color is: "+ minLetter);

        // print out less and most letter colors

    }
}
