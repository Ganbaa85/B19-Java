import WhileLoop.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ArraylistPractice {
    public static void main(String[] args) {
        ArrayList<Integer> myArrayList = new ArrayList<>();
        ArrayList<Double> myDouble = new ArrayList<>();
        ArrayList<Boolean> myboolean = new ArrayList<>();
        ArrayList<Character> myChar = new ArrayList<>();
        ArrayList<String> myArray = new ArrayList<>(5);
        ArrayList<String> myArray1 = new ArrayList<>(Arrays.asList("asd", "qwe", "zxc"));

        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        System.out.println(list);
        System.out.println(list.size());
        list.add("banana");
        System.out.println(list);
        System.out.println(list.size());
        // addAll()

        ArrayList<String> strings = new ArrayList<>();
        strings.add("dog");
        strings.add("cat");
        ArrayList<String> strings1 = new ArrayList<>();
        strings1.add("horse");
        strings1.add("cow");
        strings.addAll(strings1);
        System.out.println(strings);

        // clear();
        ArrayList<Double> doubles = new ArrayList<>();
        doubles.add(7.22);
        doubles.add(9.99);
        System.out.println(doubles);
        doubles.clear();
        System.out.println(doubles.size());
        System.out.println(doubles);

        // clone();

        ArrayList<Character> characters = new ArrayList<>(Arrays.asList('a', 'b', 'c'));
        ArrayList<Character> cloneChar = (ArrayList<Character>) characters.clone();
        System.out.println(cloneChar);
        System.out.println("----------------");

        // contains();
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("red", "blue", "white"));
        boolean containsRed = arrayList.contains("red");
        System.out.println(containsRed);
        boolean containsDark = arrayList.contains("dark");
        System.out.println(containsDark);
        System.out.println("-----------------");

        // get();

        ArrayList<String> arrayList1 = new ArrayList<>(Arrays.asList("good", "bad", "ok"));
        System.out.println(arrayList1.get(1));
        System.out.println("------------------");

        // indexOf();
        ArrayList<Integer> integerArrayList = new ArrayList<>(Arrays.asList(2, 55, 77));
        System.out.println(integerArrayList.indexOf(77));
        System.out.println("-------------------");

        // removeAll();

        ArrayList<String> cars = new ArrayList<>(Arrays.asList("Toyota", "Honda", "Bmw"));
        ArrayList<String> remove = new ArrayList<>(Arrays.asList("Honda"));
        cars.removeAll(remove);
        System.out.println(cars);

        // remove();
        ArrayList<String> arrayList2 = new ArrayList<>(Arrays.asList("hot", "Cold", "warm", "cool"));
        System.out.println(ArraylistPractice.removeIgnoreCase(arrayList2, "WARM"));

        // size();

        int[] ints = new int[3];
        int length = ints.length; // property
        ArrayList<String> dayOfTheWeek = new ArrayList<>(Arrays.asList("Monday", "tuesday", "sunday"));
        int size = dayOfTheWeek.size();
        System.out.println(size);
        System.out.println("-----------------");

        // isEmpty();
        ArrayList<Integer> integers = new ArrayList<>();
        System.out.println(integers.isEmpty());
        ArrayList<String> names = new ArrayList<>(Arrays.asList("ganbaa", "tom", "jimmy"));
        System.out.println(names.isEmpty());
        names.removeAll(names);
        System.out.println(names.isEmpty());
        System.out.println("------------------");

        // subList();
        ArrayList<String> names1 = new ArrayList<>(Arrays.asList("ganbaa", "tom", "jimmy", "tim"));
        System.out.println(names1.subList(0, 3));

        // set();

        ArrayList<String> footBallTeamNames = new ArrayList<>(Arrays.asList("Bears", "Lions", "Patriots", "Colts", "Browns"));
        footBallTeamNames.set(2, "Ravens");
        System.out.println(footBallTeamNames);
        footBallTeamNames.set(footBallTeamNames.indexOf("Colts"), "Cowboys");

        // sort();

        ArrayList<Integer> unsorted = new ArrayList<>(Arrays.asList(7, 0, 2, 15, 99, 4));
        unsorted.sort(Comparator.naturalOrder());


        // toArray()

        ArrayList<String> randomCountries = new ArrayList<>(Arrays.asList("Usa", "China", "Canada", "Mongolia"));
        String[] arrayOfCountries = randomCountries.toArray(new String[0]);
        System.out.println(arrayOfCountries.length);

        ArrayList<Integer> intNums = new ArrayList<>(Arrays.asList(2, 5, 7, 9, 11));
        Integer[] intArray = intNums.toArray(new Integer[0]);
        System.out.println(Arrays.toString(intArray));


        // toString

        ArrayList<Double> doubles1 = new ArrayList<>(Arrays.asList(3.2, 5.6, 9.9));
        String string = doubles1.toString();
        System.out.println(string);

        // ensureCapacity()

        ArrayList<Integer> integerArrayList1 = new ArrayList<>();
        integerArrayList1.ensureCapacity(10);

        // lastIndexOf()

        ArrayList<String> cars1 = new ArrayList<>(Arrays.asList("Tesla", "Honda", "Nissan", "Ford"));
        int indexOfLast = cars1.lastIndexOf("Ford");
        System.out.println(indexOfLast);
        System.out.println("---------------------");

        // retainAll()

        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("apple", "banana", "pear", "lemon", "orange"));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("book", "paper", "pear", "pencil", "orange"));
        list1.retainAll(list2);


        // containsAll()

        ArrayList<String> list3 = new ArrayList<>(Arrays.asList("apple", "banana", "pear", "lemon", "orange"));
        ArrayList<String> list4 = new ArrayList<>(Arrays.asList("pear", "orange"));
        boolean contains = list3.containsAll(list4);
        System.out.println(contains);

        // trimToSize()

        ArrayList<String> list5 = new ArrayList<>(10);
        list5.add("a");
        list5.add("s");
        list5.add("b");
        list5.trimToSize();

        // removeRange()


        // replaceAll()

        ArrayList<String> word = new ArrayList<>(Arrays.asList("Usa", "Uk", "Ufo", "Asia", "Europe"));
        word.replaceAll(String::toUpperCase);
        System.out.println("-----------------");

        // removeIf()

        ArrayList<String> word1 = new ArrayList<>(Arrays.asList("usa", "uk", "ufo", "asia", "europe", "ganbaa", "samsung"));
        word1.removeIf(word2 -> word2.length() > 4 || word2.startsWith("u"));
        System.out.println(word1);


        ArrayList<Double> num1 = new ArrayList<>(Arrays.asList(1.1, 3.5, 5.6, 2.7, 4.9, 2.6, 3.0));
        num1.removeIf(number -> number > 3);
        System.out.println(num1);

        // forEach()

        ArrayList<String> random = new ArrayList<>(Arrays.asList("ball", "shoes", "gloves", "hat", "coat"));
        random.forEach(word4 -> System.out.print(word4.charAt(0) + ", "));


    }


    public static ArrayList<String> removeIgnoreCase(ArrayList<String> arrayListModify, String wordToRemove) {
        ArrayList<String> copyOfArrayList = (ArrayList<String>) arrayListModify.clone();
        for (String eachWord : copyOfArrayList) {
            if (eachWord.equalsIgnoreCase(wordToRemove)) {
                copyOfArrayList.remove(eachWord);
                break;
            }

        }
        return copyOfArrayList;

    }
}
