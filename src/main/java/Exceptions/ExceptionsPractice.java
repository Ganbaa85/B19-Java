package Exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class ExceptionsPractice {
    public static void userInput(String fullName) {
        try {
            System.out.println(fullName.charAt(0));
        } catch (NullPointerException e) {
            System.out.println("we got u");
        }
    }

    public static void readFile() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("Non existent file"));
        try {
            while (reader.readLine() != null) {
            }
        } finally {
            reader.close();
        }
    }

    public static void main(String[] args) {
//        String word = "usa"; // StringOutOFBoundsException
//        System.out.println(word.charAt(5));
//        String word1 = null; //NullPointerException
//        System.out.println(word1.length());
//


//        int a[] = {5};
//        for (int i = 0; i <= a.length; i++){
//            System.out.println(a[i]);
//        }

        try {
            int a[] = {5};
            for (int i = 0; i <= a.length; i++) {
                System.out.println(a[i]);
            }

        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("ArrayIndexOutOfBoundsException is occurred ");
        } finally {
            System.out.println("Good job you caught the exception");
        }

        int age = 20;
        if (age < 21)
            try {
                throw new Exception("Person is under aged");
            } catch (Exception e) {
                System.out.println("Exception was thrown");
            }




    }

}
