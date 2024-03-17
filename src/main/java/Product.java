import java.util.*;

public class Product {
    // instance variables/fields/ properties
    private String name;
    private double price;
    private ArrayList<String> reviews;
    private HashSet<String> catergories;
    // static variable/ field/ property
    private static String storeName = "Shop and Spend";
    // final variable/ field/ property -- we cannot modify or change field once it's initialized

    private final int productId;

    // constructor
    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.reviews = new ArrayList<>();
        this.catergories = new HashSet<>();
    }

    public Product(int productId, String name, double price, HashSet<String> catergories) {
        this(productId, name, price);
        this.catergories = catergories;
    }

    public String getName() {
        return name;
    }

    public void addReview(String review) {
        reviews.add(review);
    }

    public void updatePrice(double price) {
        this.price = price;

    }

    public void updatePrice(double price, String reason) {
        this.price = price;
        System.out.println("Price updated due to " + reason);

    }
    // static methods
    public static String getStoreName(){
        return storeName;
    }




}
