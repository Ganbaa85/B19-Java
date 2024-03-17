public class RelationalOperators {
    public static void main(String[] args) {

        // Equals to (==)
        int a = 1;
        int b = 2;
        Boolean booleanOne = (a == b);
        System.out.println(booleanOne);

        int currentYear = 2023;
        int birthYear = 1985;
        boolean booleanTwo = (currentYear==birthYear);
        System.out.println(booleanTwo); // false

        double tempToday = 45.5;
        double tempYesterday = 45.5;
        boolean booleanThree = (tempToday==tempYesterday);
        System.out.println(booleanThree); // true

        char letter1 = 'a';
        char letter2 = 'a';
        System.out.println(letter1==letter2); // true

        float rate = 1.34f;
        float updateRate = 1.345f;
        System.out.println(rate==updateRate); // false

        long number = 45000L;
        long number1 = 45001L;
        System.out.println(number==number1); // false
        System.out.println("_____________NOT EQUALS TO________________");

        int x = 5;
        int y = 10;
        System.out.println(x != y); //two values are not equal

        double double1 = 49.99;
        double double2 = 39.99;
        System.out.println(double1 != double2); //true

        char myChar = 'a';
        char myChar1 = 'Z';
        boolean result = myChar != myChar1; // true

        System.out.println("_____________GREATER THAN_______________" );
        int score1 = 2;
        int score2 = 3;
        System.out.println(score2 > score2);

        double price = 19.99;
        double price1 = 10.99;
        System.out.println(price > price1);

        char myLetter ='a'; //97
        char myLetter1 = 'b'; //98
        System.out.println(myLetter > myLetter1); //97 > 98 False

        char myLetter2 = 'Z'; // 90
        char myLetter3 = 'c'; // 99
        System.out.println(myLetter3 > myLetter2); // True

        int myint = 88;
        myint++ ; // value is 89
        char myLetter4 = 'Y';  // Ascii value 89
        System.out.println(myint > myLetter4); //89 is not greater than 89 False


        System.out.println("___________LESS THAN______<_______");
        int q = 2;
        int w = 3;
        boolean result1 = (q < w);
        System.out.println(result1);

        double price3 = 17.50;
        double price4 = 16.99;
        System.out.println(price3 < price4);
        System.out.println((price3 < price4) == false);

        char firstLetter = 'h'; // 104 ascii value
        char secondLetter = 'P'; // 80 ascii value
        System.out.println(firstLetter < secondLetter); // 104 < 80 False
        System.out.println("__________GREATER THAN OR EQUALS TO____>=_______");

        int hoursWorked = 40;
        int hoursRequired = 40;
        System.out.println(hoursWorked >= hoursRequired);

        double balanceOfChecking = 10111.45;
        double balanceOfSavings = 5999.99;
        System.out.println(balanceOfSavings >= balanceOfSavings);

        char grade1 = 'F'; // 70
        char grade2 = 'A'; // 65
        System.out.println(grade1 >= grade2); // 70 >= 65 True
        System.out.println(grade2 >= 65);

        long distance1 = 34563l;
        long distance2 = 834750l;
        System.out.println(distance2 >= distance1);
        System.out.println("______LESS THAN OR EQUALS TO______<=______");

        int apples = 3;
        int oranges = 5;
        System.out.println(apples <= oranges);

        double heightOfTom = 5.6;
        double heightOfJerry = 6.0;
        System.out.println(heightOfTom <= heightOfJerry);

        char charZ = 'Z'; // 90
        char charY = 'Y'; // 89
        System.out.println(charY <= charZ); // 89 <= 90 true
        System.out.println("_________Assingment____________");

        double bitcoin22 = 21479.34;
        double bitcoin23 = 38012.64;
        System.out.println(bitcoin22 < bitcoin23);  // TRUE
        System.out.println(bitcoin22 > bitcoin23);  // FALSE
        System.out.println(bitcoin22 == bitcoin23); //FALSE
        System.out.println(bitcoin22 != bitcoin23);  // TRUE
        System.out.println("________LETTERS OF MY NAME___________");

        char lastLetterofLastName = 'r';
        char firstLetterOfFirstName = 'G';
        System.out.println(lastLetterofLastName < firstLetterOfFirstName);
        System.out.println(lastLetterofLastName > firstLetterOfFirstName);
        System.out.println(lastLetterofLastName == firstLetterOfFirstName);
        System.out.println(lastLetterofLastName != firstLetterOfFirstName);

        System.out.println("_______UNARY OPERATOR______________");

        int myint1 = +15; // positive by default
        //UNARY MINUS
        int myint2 = -myint1; // minus - 15 or negative
        System.out.println(myint2);
        // LOGICAL COMPLEMENT/NEGATION
        boolean isCompleted = false;
        boolean isStarted = !isCompleted;
        System.out.println(isStarted);
        System.out.println(!isStarted == !(!isCompleted));













































    }
}
