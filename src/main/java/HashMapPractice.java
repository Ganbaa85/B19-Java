import java.util.*;

public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        // setting capacity
        HashMap<Double, String> hashMap1 = new HashMap<>(30);
        // Setting the capacity and load factor (float)
        HashMap<String, String> hashMap2 = new HashMap<>(25, 0.85f);
        // Using another HashMap
        HashMap<Integer, Integer> hashMap3 = new HashMap<>();
        HashMap<Integer, Integer> hashMap4 = new HashMap<>(hashMap3);

        /*
        HashMap methods
        put()
         */
        HashMap<String, Integer> stringIntegerHashMap = new HashMap<>();
        stringIntegerHashMap.put("Ganbaa", 39);
        HashMap<String, String> stringHashMap = new HashMap<>();
        stringHashMap.put("Houston", "Texans");
        stringHashMap.put("Kansas city", "Chiefs");
        stringHashMap.put("Baltimore", "Ravens");
        // get()
        String value = stringHashMap.get("Houston");
        String value1 = stringHashMap.get("Kansas city");
        String value2 = stringHashMap.get("Baltimore");
        System.out.println(value);
        System.out.println(value1);
        System.out.println(value2);
        // remove()
        HashMap<String, String> hashMap5 = new HashMap<>();
        hashMap5.put("cold", "colder");
        hashMap5.put("hot", "hotter");
        hashMap5.remove("cold");
        System.out.println(hashMap5);

        // containsKey ()

        HashMap<String, Integer> map = new HashMap<>();
        map.put("Camry", 40);
        map.put("Civic", 50);
        map.put("lexus", 90);
        System.out.println("map.containsKey(\"Civic\") = " + map.containsKey("Civic"));
        System.out.println("------------------");

        // containsValue()

        HashMap<String, String> map1 = new HashMap<>();
        map1.put("cold", "colder");
        map1.put("hot", "hotter");
        map1.put("big", "bigger");
        System.out.println(map1.containsValue("hotter"));

        // size()
        HashMap<String, String> map2 = new HashMap<>();
        map2.put("cold", "colder");
        map2.put("hot", "hotter");
        map2.put("big", "bigger");
        System.out.println(map1.size());
        HashMap<Integer, Integer> map3 = new HashMap<>();
        System.out.println("map3.size() = " + map3.size());

        // isEmpty()
        HashMap<String, String> map4 = new HashMap<>();
        System.out.println("map4.isEmpty() = " + map4.isEmpty());
        map4.put("Me", "You");
        System.out.println("map4.isEmpty() = " + map4.isEmpty());

        // clear()

        HashMap<String, String> map5 = new HashMap<>();
        map5.put("bye", "hi");
        map5.put("see", "ya");
        map5.clear();
        System.out.println("map5.isEmpty() = " + map5.isEmpty());

        // keySet()

        HashMap<String, Integer> map6 = new HashMap<>();
        map6.put("apple", 5);
        map6.put("pear", 4);
        map6.put("cherry", 7);
        Set<String> keys = map6.keySet();
        System.out.println("keys = " + keys);

        // values()
        HashMap<String, String> map7 = new HashMap<>();
        map7.put("bulls", "chicago");
        map7.put("pistons", "detroit");
        map7.put("lakers", "los angeles");
        Collection<String> values = map7.values();
        System.out.println("values = " + values);
        System.out.println("--------------------");

        // entrySet()

        HashMap<String, Integer> map8 = new HashMap<>();
        map8.put("old", 80);
        map8.put("young", 20);
        map8.put("middle", 40);
        Set<Map.Entry<String, Integer>> entries = map8.entrySet();
        for (Map.Entry<String, Integer> entry : map8.entrySet()) {
            if (entry.getValue().equals(40)) {
                System.out.println("entry.getKey() = " + entry.getKey());
            }
        }
        for (String key : map8.keySet()) {
            System.out.println("key.toUpperCase() = " + key.toUpperCase());

        }
        for (Integer value3 : map8.values()) {
            System.out.println("value3 = " + value3);

        }
        System.out.println("----------------");

        // replace()

        HashMap<Integer, Double> num = new HashMap<>();
        num.put(2, 1.99);
        num.put(4, 6.15);
        num.put(6, 8.99);
        System.out.println("num = " + num);
        num.replace(4, 6.15, 9.99);
        System.out.println("num = " + num);
        System.out.println("------------------");

        // putAll()

        HashMap<String, Double> menu = new HashMap<>();
        menu.put("Steak", 29.99);
        menu.put("soup", 9.99);
        menu.put("burger", 15.99);

        HashMap<String, Double> breakfastMenu = new HashMap<>();
        breakfastMenu.put("soup", 11.99);
        breakfastMenu.put("eggs", 6.89);
        breakfastMenu.put("coffee", 3.49);
        menu.putAll(breakfastMenu);
        System.out.println("menu = " + menu);
        System.out.println("---------------");

        //getOrDefault()

        double price = menu.getOrDefault("sushi", 10.00);
        System.out.println(price);

        HashMap<String, String> cars = new HashMap<>();
        cars.put("toyota", "10K");
        cars.put("lexus", "20K");
        System.out.println(cars.getOrDefault("bmw", "no bmw here"));

        System.out.println("----------------------------");

        // replaceAll()

        HashMap<String, Integer> studentsGrades = new HashMap<>();
        studentsGrades.put("John", 100);
        studentsGrades.put("Bob", 90);
        studentsGrades.put("Liza", 80);
        studentsGrades.replaceAll((key, val) -> val - 5);
        System.out.println("studentsGrades down by 5 points " + studentsGrades);

        HashMap<String, Double> carParts = new HashMap<>();
        carParts.put("tires", 500.99);
        carParts.put("wipers", 15.99);
        carParts.put("break pads", 80.99);
        carParts.replaceAll((key, value5) -> (double)Math.round(value5 - (value5 * 0.1)));
        System.out.println("Discounted price is: " + carParts + " $");


    }
}
