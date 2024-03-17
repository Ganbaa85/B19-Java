public class ArrayPractice {
    public static void main(String[] args) {
        String[] groceryList = new String[10];
        groceryList[0] = "Meat";
        groceryList[1] = "Apple";
        groceryList[2] = "Bread";
        groceryList[3] = "Salt";
        System.out.println(groceryList[0]);
        System.out.println(groceryList[5]);
        int[] numbers = new int[7];
        numbers[0] = 100;
        numbers[1] = 122;
        numbers[2] = 99;
        numbers[3] = -10;
        numbers[4] = 242;
        numbers[5] = 9999;
        System.out.println(numbers[0]);
        boolean[] booleanArray = new boolean[3];
        booleanArray[0] = false;
        booleanArray[1] = true;
        booleanArray[2] = true;
        System.out.println(booleanArray[2]);
        System.out.println("__________________");

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        ArrayPractice arr = new ArrayPractice();



    }
}