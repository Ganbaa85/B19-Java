public class StringBuilderPractice {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("asd");
        System.out.println(stringBuilder);
        stringBuilder.append("-qwer");
        System.out.println(stringBuilder);
        stringBuilder.append(5);
        System.out.println(stringBuilder);
        StringBuilder stringBuilderWithValue = new StringBuilder("Ganbaatar");
        stringBuilderWithValue.append(" Jargal");
        System.out.println(stringBuilderWithValue);
        StringBuilder word = new StringBuilder("I Java");
        word.insert(word.indexOf("J"), "Love ");
        System.out.println(word);
        ; // "I Love Java"
        StringBuilder stringBuilder1 = new StringBuilder("7738127228");
        stringBuilder1.insert(3, "-");  //773-8127228
        stringBuilder1.insert(7, "-"); //773-812-7228
        System.out.println(stringBuilder1);
        StringBuilder stringBuilder2 = new StringBuilder("GoodafternoonUnitedStates");
        stringBuilder2.insert(stringBuilder2.indexOf("a"), " ")
                .insert(stringBuilder2.indexOf("U"), ", ")
                .insert(stringBuilder2.indexOf("S"), " ")
                .insert(stringBuilder2.length(), "!");
        System.out.println(stringBuilder2);
        System.out.println("_________DELETE________________");
        StringBuilder stringBuilder3 = new StringBuilder("Hello World");
        stringBuilder3.delete(stringBuilder3.indexOf(" "), stringBuilder3.length());
        System.out.println(stringBuilder3);
        StringBuilder stringBuilder4 = new StringBuilder("ABCDE");
        stringBuilder4.deleteCharAt(2).deleteCharAt(1);
        System.out.println(stringBuilder4);
        ; // ABDE - C is deleted
        StringBuilder stringBuilder5 = new StringBuilder("0123456");
        stringBuilder5.deleteCharAt(0).deleteCharAt(0).deleteCharAt(1);
        System.out.println(stringBuilder5);
        System.out.println("_________REVERSE________________");
        StringBuilder stringBuilder6 = new StringBuilder("ABCDE");
        stringBuilder6.reverse();
        System.out.println(stringBuilder6);
        System.out.println("____________toString_________________");

        StringBuilder stringBuilder7 = new StringBuilder("hello");
        String string = stringBuilder7.toString();
        System.out.println(string);

        System.out.println("____________replace(Str)_________________");
        StringBuilder stringBuilder8 = new StringBuilder("Java");
        stringBuilder8.replace(stringBuilder8.indexOf("a"), stringBuilder8.indexOf("v") + 1, "G");
        System.out.println(stringBuilder8);

        StringBuilder stringBuilder9 = new StringBuilder("Encyclopedia");
        stringBuilder9.replace(0, stringBuilder9.indexOf("o") + 1, "Wiki");
        System.out.println(stringBuilder9);
        System.out.println("____________length_________________");
        StringBuilder stringBuilder10 = new StringBuilder("Ganbaa");
        System.out.println(stringBuilder10.length());
        System.out.println("____________capacity_________________"); // default is 16
        StringBuilder stringBuilder11 = new StringBuilder("ganbaa");
        System.out.println(stringBuilder11.capacity());
        System.out.println("____________charAt_________________");
        StringBuilder stringBuilder12 = new StringBuilder("Chicago");
        System.out.println(stringBuilder12.charAt(2));
        System.out.println("____________subString________________");
        StringBuilder stringBuilder13 = new StringBuilder("chicago");
        String sub = stringBuilder13.substring(0, stringBuilder13.indexOf("c", 1));
        System.out.println(sub);
        String sub1 = stringBuilder13.substring(stringBuilder13.indexOf("a"));
        System.out.println(sub1);


    }
}
