public class IncrementAndDecrement {
    public static void main(String[] args) {
        //variable ++
        //Increment is used when the value is supposed to be increased by one
        // post increment - value of the variable is used in expression first,
        // and the the variable is gettin increased(by 1)

        int a = 1;
        System.out.println(a++); // it will increas the value after
        System.out.println(a); // number is already increased 2
        int age = 35;
        System.out.println(age++);
        age++;
        System.out.println(age);
        int c = 5;
        c++;
        System.out.println(c);
        // post decrement
        int b = 2;
        b--; // b = b - 1
        System.out.println(b);
        int d = 10;
        d--;
        System.out.println(d);
        //Post decrement syntax is variable--

        int ab = 2;
        System.out.println(ab--);
        int g = 1; // initial value is 1
        System.out.println(g--);
        g++;
        g--;
        System.out.println(g--);
        g++;
        System.out.println(g);
        System.out.println(g-- + g++);
        System.out.println("______________Pre________________");

        // The value of variable is increased by 1 first and then used in the expression.
        //syntax ++variable

        int pre = 2;
        int pre1 = ++pre;
        System.out.println(pre1);

        int z = 99; // variable is declared initialized in 99
        ++z; // variable is pre-incremented
        int x = z; //value of z is getting assigned to x
        System.out.println(x);
        int xy = 1;
        int y = ++xy; // 2, 'x' is pre-incremented first and then assigned to 'y'
        System.out.println(y);


        System.out.println("--------------");

        int k = 99;
        k++; // post-incremented by 1 ===> k = 100;
        k--; // post-decremented by 1 ===> k = 99;
        ++k; // pre-incremented by 1 ===> k = 100;
        System.out.println(k); // 100
        k--; // post-decremented by 1 ===> k = 99;
        ++k; // pre-incremented by 1 ===> k = 100;
        System.out.println(++k); // pre-incremented by 1, 101


        System.out.println("-----------");

        int j = 100;
        System.out.println(j++); // 100 // post-increment ===> prints out the value first, and then incremented ==> prints out 100, j = 101;
        System.out.println(++j); // 102 // pre-increment ===> the value of j is incremented (102), and then it's printing out 102, j = 102;
        j++; // post-increment ===> j = 103;
        System.out.println(j); // 103 // prints out 103, j = 103;
        j--; // post-decrement ===> j = 102;
        System.out.println(++j); // 103 // pre-increment ===> j = 103; then it's going to print out 103;
        j++; // post-increment ===> j = 104;
        System.out.println(j++); // 104 // post-increment ===> prints out the value of j and then increments by 1
        /*
        Pre-Decrement
        syntax; --variable                */

        int aa = 5;
        int bb = 3 + --aa;
        System.out.println(bb);

        int aaa = 5;
        int bbb = 3 + aaa--;
        System.out.println(bbb);
        System.out.println(aaa);
        System.out.println("____________________");
        int m = 10;
        int n = --m + m--;
        System.out.println(n);
        System.out.println(m);
        System.out.println("__________________________");
        // Example 4
        int f = 2;
        int firstExpression = --f; // pre-decrement of f; firstExpression = 1; f = 1;
        int secondExpression = f++; // post-increment of f; secondExpression = 1; f = 2;
        int thirdExpression = --f; // pre-decrement of f; thirdExpression = 1; f = 1;
        int fourthExpression = f; // simple assignment; fourthExpression = 1;

        int result = firstExpression + secondExpression - thirdExpression + fourthExpression;
        System.out.println(result);
        // 1 + 1 - 1 + 1  = 2





           }
}