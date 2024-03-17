package WhileLoop;

public class ForLoopPractice4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++)
            if (i % 2 != 1) {
                System.out.print(i + ",");
            }
        for (int i = 0; i <= 100; ) {
            System.out.println(i);
            i += 49;
        }
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter a word");
//        String userWord = scanner.nextLine();
//        for (int i = 0; i < userWord.length(); i++) {
//            char current = userWord.charAt(i);
//            if (current == 'A' || current == 'a' ||
//                    current == 'E' || current == 'e' ||
//                    current == 'U' || current == 'u' ||
//                    current == 'O' || current == 'o' ||
//                    current == 'I' || current == 'i')
//                System.out.println(current);
//        }


    }
}
