public class AssignmentOperators {
    public static void main(String[] args) {

        // simple assignment
        // 1.
        int a = 1; // we assign the value 1 to the variable A

        // 2. Addition assignment +=

        int c = 10;
        c += 3; // is equivalent to c = c + 3
        // c = 10 + 3
        System.out.println(c);

        int d = 12;
        d += 10;
        System.out.println(d);

        // 3. Subtraction assignment  -=

        int e = 5;
        e -= 3; // equivalent to e = e - 3; e = 5 - 3;
        System.out.println(e);
        e -= 3;
        System.out.println(e);

        // 4.Multiplication assignment *=
        int f = 8;
        f *= 5;   // is equivalent to f = f * 5     f=8 * 5
        System.out.println(f);

        int g = 100;
        g *= 3;
        System.out.println(g);

        //5.  Division assinment /=
        int i = 100;
        i /= 25;  // i = i / 25    100/25 = 4
        System.out.println(i);

        int j = 20;
        j /= 5;
        System.out.println(j);

        // 6.  Modulus assignment  %=

        int k = 5;
        k %= 2; // is equivalent to k = k % 2     k = 5 % 2     k=1
        System.out.println(k);

        int l = 10;
        l %= 4;
        System.out.println(l);
        System.out.println("-------------------------------");
         byte myByte = 10;
         myByte = (byte) (myByte + 1);
         // Casting is the process of converting one data type to another
         // (byte)  is used to convert the data type of int to byte
        System.out.println(myByte);
        byte myByte1 = 1;
        int myConvertedByte = (int) myByte1;
        short myConvertedShort = (short) myByte1; // up casting no need parenthesses

        long myLong = (long) myByte1;

        int myInt = 10;        //down casting
        byte myByte2 = (byte) myInt;
        short myshort1 = (short) myInt;
        long myLong3
                = (long) myInt;





















    }
}
