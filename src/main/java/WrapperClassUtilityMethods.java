public class WrapperClassUtilityMethods {
    public static void main(String[] args) {
        String str = "3"; // NumberFormatException if there are letters
        int parsedInt = Integer.parseInt(str);
        System.out.println(parsedInt);

        // Integer
        Integer num = Integer.valueOf(10); // converts int to Integer
        Integer num1 = Integer.valueOf("300"); // converts String to Integer
        Integer num2 = new Integer(22);
        int num3 = num2.intValue();

        // Double
        String str1 = "3.14";
        double parsedDouble = Double.parseDouble(str1); // parses String onto Double
        Double double1 = Double.valueOf(6.99); //converts double to Double
        double double2 = Double.valueOf("3.99"); // converts String to Double to primitive(unboxing)
        Double double3 = new Double(19.99);
        double double4 = double3.doubleValue(); // returns value of Double wrapper as a double

        //Boolean
        boolean bool = Boolean.parseBoolean("true"); // parsing the String onto boolean
        Boolean bool1 = Boolean.valueOf("true");
        Boolean bool2 = new Boolean(true);
        boolean bool3 = bool2.booleanValue();

        // Character wrapper class utility method

        // isLetter() -- returns boolean
        boolean isLetter = Character.isLetter('A'); // true
        boolean isLetter1 = Character.isLetter('9');
        // isDigit()
        boolean isDigit1 = Character.isDigit('2');
        boolean isDigit2 = Character.isDigit(50);

        // ToUpperCase(char a) returns an UpperCase version
        char toUpperCase = (char) Character.toUpperCase(100);

        // ToLowerCase(char a) returns an LowerCase version
        char toLowerCase = (char) Character.toLowerCase(80);


        // Float
        float f = Float.parseFloat("10.5"); // parse String to float
        Float f1 = Float.valueOf(11.9f);    // converts float to Float wrapper class
        Float f2 = new Float(12.5f);
        float f3 = f2.floatValue();           // converts Float wrapper to primitiveDataType

        // Long
        long l = Long.parseLong("12345678");    // parse String to long
        Long l1 = Long.valueOf(12345678);
        Long l2 = new Long(l);
        long l3 = l2.longValue();         // converts Long wrapper to primitiveDataType
        System.out.println(l3);
        // Short
        short short1 = Short.parseShort("32767");   // parses String to short
        System.out.println(short1);
        Short short2 = Short.valueOf((short) 333);  // convert short onto Short wrapper class
        Short short3 = new Short((short) 500);
        System.out.println(short3);
        short short4 = short3.shortValue(); //   converts Short wrapper to primitiveDataType
        // Byte
        byte b = Byte.parseByte("123");
        Byte b1 = Byte.valueOf((byte) 111);
        Byte b2 = new Byte((byte) 111);
        byte b3 = b2.byteValue();



    }
}
