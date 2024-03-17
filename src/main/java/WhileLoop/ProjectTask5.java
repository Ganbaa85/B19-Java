package WhileLoop;

public class ProjectTask5 {
    public static void main(String[] args) {
        // define variable,condition,update
        for (int i = 0; i < 1; i++) { //variable i is in only available in this for loop
            System.out.println("Codefish");
        }
        for (int i = 1; i <= 2; i++) {
            System.out.println(i + " .Codefish");
        }
        for (int i = 0; i > 0; i--) {
            System.out.println(i);
        }
        int total = 0;
        for (int i = 0; i <= 100; i++) {
            total += i;
        }
        System.out.println(total);


    }
}
