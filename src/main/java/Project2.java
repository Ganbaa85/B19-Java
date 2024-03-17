public class Project2 {
    public static void main(String[] args) {
        int number = 578432;
        int digitOne = number/100000;
        System.out.println(digitOne);
        int digitTwo = (number/10000) %10;
        System.out.println(digitTwo);
        int digit3 = (number/1000)%10;
        System.out.println(digit3);
        int digit4 = (number/100)%10;
        System.out.println(digit4);
        int digit5 = (number/10)%10;
        System.out.println(digit5);
        int digit6 = number%10;
        System.out.println(digit6);
        int multiplication = digitOne*digitTwo*digit3*digit4*digit5*digit6;
        System.out.println(multiplication);
        int sum = digitTwo+digitTwo+digit3+digit4+digit5+digit6;
        System.out.println(sum);
        System.out.println("________reversed_________");
        int bignumber = 53867;
        int revNum = bignumber/10000;
        System.out.println(revNum);
        int revNum2 = (bignumber/1000) %10;
        System.out.println(revNum2);
        int revNum3 =(bignumber/100)%10;
        System.out.println(revNum3);
        int revNum4 = (bignumber/10)%10;
        System.out.println(revNum4);
        int revNum5 = bignumber%10;
        System.out.println(revNum5);
        System.out.println("" +revNum5+revNum4+revNum3+revNum2+revNum);

        System.out.println("___________________");
        String word = "Hello";
        int letter1 = word.length();
        String word1 = "Mom";
        int letter2 = word1.length();
        String word2 = "I Love You";
        int letter3 = word2.length();
        System.out.println(word + " " + word1 + " " + word2);
        System.out.println(letter1);
        System.out.println(letter2);
        System.out.println(letter3);
        System.out.println("+------------------------------------------------+");
        System.out.println("|                                                |");
        System.out.println("|                                                |");
        System.out.println("|                                                |");
        System.out.println("|                                                |");
        System.out.println("|                                                |");
        System.out.println("|                  Dear Students                 |");
        System.out.println("|                                                |");
        System.out.println("|                                                |");
        System.out.println("|                                                |");
        System.out.println("|              This is the CodeFish              |");
        System.out.println("|              It can span Multiple lines        |");
        System.out.println("|                                                |");
        System.out.println("|                                                |");
        System.out.println("|                                                |");
        System.out.println("|           Sincerely                            |");
        System.out.println("|                                                |");
        System.out.println("|                                                |");
        System.out.println("|                                                |");
        System.out.println("|           CodeFish                             |");
        System.out.println("|           2200 E DEVON ST # 385                |");
        System.out.println("|           DES PLAINES IL 60618                 |");
        System.out.println("|                                                |");
        System.out.println("|                                                |");
        System.out.println("+------------------------------------------------+");

        int x = 10;
        int y = 20;
        int temp = x;
        x = y;
        y = temp;
        System.out.println("x = " + x);
        System.out.println("y = " + y);









    }
}
