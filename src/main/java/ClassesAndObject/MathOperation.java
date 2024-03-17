package ClassesAndObject;

public class MathOperation {
    int multiply(int number1, int number2) {
        return number1 * number2;

    }

    int multiply(int number1, int number2, int number3) {
        return number1 * number2 * number3;
    }

    double multiply(double number1, double number2, double number3) {
        return number1 * number2 * number3;
    }

    double multiply(double number1, float number2) {
        return number1 * number2;
    }

    int add(int number1, int number2) {
        return number1 + number2;

    }

    int add(int number1, int number2, int number3) {
        return number1 + number2 + number3;
    }

    double add(double number1, float number2) {
        return number1 + number2;
    }

    int subtract(int number1, int number2, int number3) {
        return number1 - number2 - number3;
    }

    double subtract(double number1, double number2) {
        return number1 - number2;
    }

    double subtract(double number1, float number2) {
        return number1 - number2;
    }


    public static void main(String[] args) {
        MathOperation mathOperation = new MathOperation();
        mathOperation.multiply(2, 3);
        mathOperation.multiply(4, 5, 6);
        mathOperation.multiply(2.5, 3.14, 3.99);
        mathOperation.multiply(2.75, 4.5f);

        mathOperation.add(4, 8);
        double number = mathOperation.add(2.5, 5.7f);
        mathOperation.add(6, 8, 17);

        mathOperation.subtract(90, 65, 4);
        mathOperation.subtract(67.8, 24.7);
        mathOperation.subtract(68.9, 23.7f);


        System.out.println(number);


    }


}
