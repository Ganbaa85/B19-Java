package WhileLoop;

public class ForLoopPractice5 {
    public static void main(String[] args) {
        String car = "Mercedes";

        for (int i = car.length() - 1; i >= 0; i--) {
            char letter = car.charAt(i);
            System.out.println(letter);
        }
        String car1 = "Civic";
        for (int i = 0; i < car1.length();i++){
            char palindrome = car1.charAt(i);
            car1 = car + palindrome;

                System.out.println("this is not ");
            System.out.println("This word is Palindrome  " + palindrome);
        }



    }
}
