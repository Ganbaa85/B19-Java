import java.util.HashMap;
import java.util.Scanner;

public class HashMaptask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        HashMap<String, Double> productsAndPrice = new HashMap<>();
        String[] userProduct = new String[3];
        double totalPrice = 0.0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Please enter the products " + i);
            String productName = scanner.nextLine();
            System.out.println("Please enter the price" + i);
            double productPrice = scanner.nextDouble();
            scanner.nextLine();
            productsAndPrice.put(productName, productPrice);
            userProduct[i] = productName;

        }
        for (String productName : userProduct) {
            totalPrice += productsAndPrice.get(productName); // adding every price
        }

        System.out.println("Total of all products is: " + totalPrice);
        System.out.println("which one u remove ");
        productsAndPrice.remove(scanner.nextLine());
        System.out.println("Updated " + productsAndPrice);
        System.out.println("Please choose product ");
        String productPurchase = scanner.nextLine();
        System.out.println("please enter the amount " + productPurchase);
        double amount = scanner.nextDouble();
        scanner.nextLine();
        double totalPriceAmount = productsAndPrice.get(productPurchase) * amount;
        System.out.println("Total price for " + amount + "$ for " + productPurchase + " is " + totalPriceAmount);



    }
}
