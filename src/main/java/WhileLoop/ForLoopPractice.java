package WhileLoop;

public class ForLoopPractice {
    public static void main(String[] args) {

        for (int i = 0; i <= 300; i++) {
            if (i == 100) {
                System.out.println("This is Bingo number");
            }
        }

        for (int i = 1; i <= 81; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " divisible by 3 and 5");
            } else if (i % 3 == 0) {
                System.out.println(i + " divisible by three ");
            } else if (i % 5 == 0) {
                System.out.println(i + " divisible by five ");
            }


        }



    }
}
