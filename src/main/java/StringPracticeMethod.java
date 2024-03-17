import java.util.Arrays;

public class StringPracticeMethod {
    public static void main(String[] args) {
        //1. LENGTH()
        String word = "ANKA";
        int length = word.length();
        System.out.println(length);
        // 2.charAt
        String word1 = "Ganbaa";
        char index1 = word1.charAt(3);
        System.out.println(index1);
        System.out.println(word1.charAt(2));
        System.out.println("__________________");
        String word2 = "encyclopedia";
        System.out.println(word2.charAt(9));
        System.out.println(word2.charAt(10));
        //Last index
        String word3 = " America";
        char lastindex = word3.charAt(word3.length() - 1);
        System.out.println(lastindex);
        //3.contains("<strings>") gives you true/false
        String word4 = "europe";
        boolean contains = word4.contains("rope");
        System.out.println(contains);
        boolean containsSpace = word4.contains("space");
        System.out.println(containsSpace);
        String sentence = "Hello, World!";
        boolean cWorld = sentence.contains("WORLD");
        System.out.println(cWorld);
        System.out.println("_______________concat________________");
        // 4.concat() - is used to concatenate two strings
        String word5 = "hello ";
        String word6 = "world";
        String concatString = word5.concat(word6).concat(word3);
        System.out.println(concatString);
        String ProgrammLanguage = "Java";
        String levelOfDifificulty = "eeeezy";
        String finalVersion = ProgrammLanguage.concat(" ").concat("is ").concat(levelOfDifificulty).concat("!");
        System.out.println(finalVersion);
        //5.indexOf()
        System.out.println("____________Index of____________");
        String word7 = "java";
        int indexOfJ = word7.indexOf("a");
        int indexx = word7.indexOf('a', 2);
        System.out.println(indexx);
        System.out.println("Index of j is: " + indexOfJ);
        //5.substring
        System.out.println("____________substring____________");
        String myword = "America";
        String newString = myword.substring(3, 6);
        System.out.println(newString);
        //ica
        String newstring1 = myword.substring(4);
        System.out.println(newstring1);
        String myword2 = "encyclopedia";
        String newstring2 = myword2.substring(2, 8);
        System.out.println(newstring2);
        String myword3 = word2.substring(word2.indexOf('c'), word2.indexOf('i'));
        System.out.println(myword3);
        String Usa = "United States Of America";
        String words = Usa.substring(Usa.indexOf('S'), Usa.indexOf(' ', 7));
        System.out.println(words);
        String words1 = Usa.substring(Usa.indexOf('A'));
        System.out.println(words1);
        System.out.println("_________toLowersCase_______________");
        String str = "CHiCago";
        String lowerCase = str.toLowerCase();
        System.out.println(lowerCase);
//        String str1 = null;
//        System.out.println(str1.toLowerCase()); //NullPointerException
        System.out.println("__________toUpperCase_______________");
        String str2 = "ganbaa";
        String upperCase = str2.toUpperCase();
        System.out.println(upperCase);
        System.out.println("__________startsWith________________");
        String str3 = "Hello world";
        System.out.println(str3.startsWith("Hell"));
        System.out.println(str3.startsWith("hell"));
        System.out.println("____________endsWith________________");
        String str4 = "Canada";
        boolean ends = str4.endsWith("ada");
        System.out.println("The word " + str4 + " ends with ada " + ends);
        System.out.println("The word " + str4 + " ends with xyz " + str4.endsWith("xyz"));
        System.out.println("____________equals__________________");
        String str5 = "America";
        String str6 = "america";
        System.out.println(str5.equals(str6));
        String wordStr = "Elephant";
        String wordStr1 = "ELEPHANT";
        System.out.println("Comparing: " + wordStr + " with " + wordStr1 + " is " + wordStr.equalsIgnoreCase(wordStr1));
        System.out.println("____________replace__________________");
        String newword = "hello";
        System.out.println(newword.replace('l', 'p'));
        String newStr = "Hello world";
        System.out.println(newStr.replace("world", "ganbaa"));
        String firstReplace = "Good";
        System.out.println(firstReplace.replaceFirst("o", "O"));
        String sentence1 = "Good morning, class! Have a good day";
        System.out.println(sentence1.replaceFirst("oo", "OO"));
        System.out.println("____________isEmpty__________________");
        String emptystr = "asd";
        System.out.println(emptystr.isEmpty());
        String emptyStr = "";
        System.out.println(emptyStr.isEmpty());
        String emptySpace = " ";
        System.out.println(emptySpace.isEmpty());
        String empty = "";
        String empty1 = " ";
        System.out.println(empty.isBlank());
        System.out.println(empty1.isBlank());
        System.out.println("_______________trim__________________");
        String trimming = "  java ";
        System.out.println(trimming.trim());
        System.out.println("_______________split_________________");
        String phrase = "Hasta la vista baby";
        String[] words2 = phrase.split("la");
        System.out.println(Arrays.toString(words2));
        String[] letters = phrase.split("");
        System.out.println(Arrays.toString(letters));
        String[] words3 = phrase.split("vista");
        System.out.println(Arrays.toString(words3));
        String splitt = "united states of americe";
        String[] words4 = splitt.split(" ");
        String[] words5 = splitt.split("i");
        System.out.println(Arrays.toString(words4));
        System.out.println(Arrays.toString(words5));
        System.out.println("_______________toCharArray_______________");

        char[] letters1 = "java".toCharArray();
        System.out.println(Arrays.toString(letters1));

        String countryName = "Mongolia";
        char[] letters2 = countryName.toCharArray();
        System.out.println(Arrays.toString(letters2));
        System.out.println("_______________compareTo_______________");
        String word8 = "Banana";
        String word9 = "Apple";
        int result = word9.compareTo(word8);
        System.out.println(result);
        int result1 = word8.compareTo(word9);
        System.out.println(result1);
        String state = "illinios";
        String state1 = "illinios";
        int result2 = state1.compareTo(state);
        System.out.println(result2);
        String cityName = "Ulaanbaatar";
        String cityName1 = "Chicago";
        int result3 = cityName.compareTo(cityName1);
        System.out.println(result3);
        System.out.println(Arrays.toString(cityName.toCharArray()));
        System.out.println(Arrays.toString(cityName1.toCharArray()));
        System.out.println("_______________compareToIgnoreCase_______________");
        String words6 = "amereica";
        String words7 = "Barcelona";
        int result4 = words6.compareToIgnoreCase(words7);
        System.out.println(result4);
        String words8 = "united      states";
        String[] words9 = words8.split("      ");
        System.out.println(words9[0] + " " + words9[1]);
        String substring = words8.substring(0, 6);
        String substring1 = words8.substring(words8.indexOf('s'));
        System.out.println(substring + " " + substring1);


    }
}
