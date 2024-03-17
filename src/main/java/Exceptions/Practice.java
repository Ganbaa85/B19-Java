package Exceptions;

public class Practice {
    public static void main(String[] args) {
        String number = "10.5";
        try {
            int result = Integer.parseInt(number) / 0;
        } catch (NumberFormatException numberFormatException) {
            System.out.println("NumberFormatException caught");
        } catch (ArithmeticException arithmeticException) {
            System.out.println("ArithmeticException caught");
        }
        int[] arr = null;
        try {
            int num = arr[3];
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("ArrayIndexOutOfBoundsException caught");
        } catch (NullPointerException exception) {
            System.out.println("NullPointerException caught");
        }
        try {
            String str = "Java";
            char ch = str.charAt(10);
            int a = 10 % 0;
            System.out.println("Char at 10 " + ch);
        } catch (ArithmeticException exception) {
            System.out.println("ArithmeticException is caught");
        } catch (StringIndexOutOfBoundsException exception) {
            System.out.println("StringIndexOutOfBoundsException is caught");
        }
        System.out.println("---------------------");

        try {
            System.out.println("Outer try block.");
            try {
                System.out.println("Inner try block.");
                int b = 0;
                int a = 1 / b;
            } catch (ArithmeticException e) {
                System.out.println("ArithmeticException is caught.");
            }
        } catch (Exception e) {
            System.out.println("Exception is caught.");
        }

        try {
            String[] fruits = {"apple", "banana"};
            System.out.println(fruits[5]);
        } catch (RuntimeException e) {
            System.out.println("RuntimeException is caught");
        }

    }
}
