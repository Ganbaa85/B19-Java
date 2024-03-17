import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HashSetPractice {
    HashSet<String> myFirstHashSet = new HashSet<>(); // default hashset
    HashSet<String> hashSet = new HashSet<>(10); // hashset using overloaded constructor sets capacity
    HashSet<String> hashSet1 = new HashSet<>(17, 0.85f);
    ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("apple", "peach", "cherry"));
    HashSet<String> hashSet2 = new HashSet<>(arrayList);
    // Intermediate level
    Set<String> set = Set.of("apple", "peaches", "cherries"); // this is immutable set(can't reomve or add elements)

    // Advanced way of creating hashset, it uses stream() API

    HashSet<String> hashSet3 = Stream.of("hot", "cold", "warm").collect(Collectors.toCollection(HashSet::new));

    ArrayList<Integer> newInt = new ArrayList<>(Arrays.asList(1, 99, 100));
    HashSet<Integer> integerHashSet = new HashSet<>(newInt);
    Set<Double> doubleSet = Set.of(99.99, 1.9, 3.14);
    HashSet<Float> floatHashSet = Stream.of(1.15f, 4.55f, 6.66f).collect((Collectors.toCollection(HashSet::new)));

    public static void main(String[] args) {

        // HashSet methods
        // add()

        HashSet<String> hashSet4 = new HashSet<>();
        hashSet4.add("Apple");
        hashSet4.add("Banana");
        System.out.println(hashSet4);

        HashSet<Integer> integerHashSet1 = new HashSet<>();
        integerHashSet1.add(99);
        integerHashSet1.add(55);
        System.out.println(integerHashSet1);

        // remove()

        HashSet<String> hashSet5 = new HashSet<>(Arrays.asList("Mongolia","Japan","China"));
        hashSet5.remove("China");
        System.out.println(hashSet5);

        // contains()
        HashSet<String> hashSet6 = new HashSet<>(Arrays.asList("Mongolia","Japan","China"));
        System.out.println(hashSet6.contains("Mongolia"));

        // size()

        HashSet<String> hashSet7 = new HashSet<>();
        hashSet7.add("Ganbaa");
        System.out.println(hashSet7.size());

        // isEmpty()

        HashSet<String> hashSet8 = new HashSet<>();
        System.out.println("is Empty? "+hashSet8.isEmpty());
        System.out.println("----------------------");

        // clear()

        HashSet<String> hashSet9 = new HashSet<>(Arrays.asList("Doctor","Engineer","Police"));
        hashSet9.clear(); // removes all elements

        // iterator()
        HashSet<String> hashSet10 = new HashSet<>(Arrays.asList("good","bad","nice","cool"));
        Iterator<String> iterator = hashSet10.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        hashSet10.removeIf(word -> word.contains("o"));
        // hashset will removes the element in this hashSet based on the filter

        // addAll()

        ArrayList<String> arrayList1 = new ArrayList<>(Arrays.asList("dog","cat","fish","cat"));
        HashSet<String> stringHashSet = new HashSet<>();
        stringHashSet.addAll(arrayList1);
        System.out.println(stringHashSet);
        System.out.println("-------------------");

        // null value in hashSet

        HashSet<String> hashSet11 = new HashSet<>();
        hashSet11.add(null);   // null to hashSet
        hashSet11.add(null);   // attempt to add null value to hashset that already contains NULL
        System.out.println(hashSet11);

        //














    }



}
