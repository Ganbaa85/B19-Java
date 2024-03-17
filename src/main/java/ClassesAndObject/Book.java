package ClassesAndObject;

public class Book {
    String name;
    int pages;
    String cover;
    String author;
    int pictures;

    public static void main(String[] args) {

        Book myBook = new Book();  // We have created an object/instance of Book class

        Book ganbaasBook = new Book();
        ganbaasBook.name = "Avengers";
        ganbaasBook.pages = 300;
        ganbaasBook.cover = "Soft cover";
        ganbaasBook.author = "Ganbaa";
        ganbaasBook.pictures = 150;

        System.out.println("Name of the book is: " + ganbaasBook.name);
        System.out.println("The book has " + ganbaasBook.pages + " pages");
        System.out.println("Cover has " + ganbaasBook.cover.length() + " pages ");
        System.out.println("Author of the book is: " + ganbaasBook.author);
        System.out.println("This book has " + ganbaasBook.pictures + " pictures ");


    }

}
