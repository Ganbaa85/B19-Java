import java.util.Scanner;

public class ProjectTask5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str =scanner.nextLine();
        str = str.trim();
        String result ="";

        for (int i = 0;i <str.length();i++){
            String currentChar = str.substring(i,i +1);
            if (!result.contains(currentChar)){
                result += currentChar;
            }

        }
        System.out.println(result);
    }
}
