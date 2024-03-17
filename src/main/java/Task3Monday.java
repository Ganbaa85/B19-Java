import java.util.Scanner;

public class Task3Monday {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter the string value: ");
//        String StringValue = scanner.nextLine();
//        System.out.println("Please enter the first number: ");
//        int firstNumber = scanner.nextInt();
//        System.out.println("Please enter the second number: ");
//        int secondNumber = scanner.nextInt();
//        System.out.println(StringValue.substring(firstNumber - 1, secondNumber));

  //    String word = "Snicker";
    //    System.out.println(word.trim().toUpperCase().substring(0,7).charAt(2));
     //   String word = "Cookie";
     //   System.out.println(word.toLowerCase().replace("o","u").concat("s").startsWith("C"));
      /*  System.out.println("Please enter the string: ");
        String firstStr = scanner.nextLine();
        String secondStr = scanner.nextLine();
        String thirdStr = scanner.nextLine();
        System.out.println(firstStr.length()==secondStr.length()&& secondStr.length()==thirdStr.length()&& firstStr.
                toLowerCase().contains("java") && secondStr.toLowerCase().contains("java") && thirdStr.toLowerCase().contains("java")
                && Character.isUpperCase(firstStr.charAt(0))&& Character.isUpperCase(secondStr.charAt(0))&&Character.
                isUpperCase(thirdStr.charAt(0)));*/

      /*  System.out.println("Please enter the sentence: ");
        String inputSentence = scanner.nextLine();

        System.out.println(inputSentence.indexOf(" ")-1);
        System.out.println(inputSentence.indexOf(" " , 11)-1 );
        System.out.println(inputSentence.length()-1);
        System.out.println(inputSentence.indexOf(" ") -1
                + inputSentence.indexOf(" ",11)-1
                +inputSentence.length()-1); */

        StringBuilder stringBuilder1 = new StringBuilder("Programming");
        StringBuilder stringBuilder2 = new StringBuilder();
        StringBuilder stringBuilder3 = new StringBuilder(8);
        System.out.println(stringBuilder1);
        System.out.println(stringBuilder2);
        System.out.println(stringBuilder3);
        stringBuilder1.append(" Language");
        System.out.println(stringBuilder1);
        stringBuilder1.insert(stringBuilder1.indexOf("P"),"I love ");
        System.out.println(stringBuilder1);
        stringBuilder1.delete(7,11);
        System.out.println(stringBuilder1);
        //stringBuilder2.deleteCharAt(2);
        //System.out.println(stringBuilder2);
        stringBuilder3.reverse();
        System.out.println(stringBuilder3);







































    }
}
