package WhileLoop;

public class ForLoopPractice7 {
    public static void main(String[] args) {


        for (int i = 1; i < 4; i++) {    // outer for loop
            System.out.println("Week " + i);
            for (int j = 1; j <= 7; j++) { // inner for loop

                if (j == 1) {
                    System.out.println(j + ". Project day: ");
                } else if (j == 2) {
                    System.out.println(j + ". Java Class " + "Day: ");
                } else if (j == 3) {
                    System.out.println(j + ". Java Class " + "Day: ");
                } else if (j == 4) {
                    System.out.println(j + ". Off Day: ");
                } else if (j == 5) {
                    System.out.println(j + ". Off Day: ");
                } else if (j == 6) {
                    System.out.println(j + ". Java Class " + "Day: ");
                } else if (j == 7) {
                    System.out.println(j + ". Java Class " + "Day: ");


                }
            }
        }
    }
}