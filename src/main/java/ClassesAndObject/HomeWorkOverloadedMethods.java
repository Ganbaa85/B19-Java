package ClassesAndObject;

public class HomeWorkOverloadedMethods {
    static int addedInt1 = 0;
    static int addedInt2 = 0;
    static double addedDouble1 = 0;
    static double addedDouble2 = 0;
    static int subNum1 = 0;
    static int subNum2 = 0;
    static double subDouble1 = 0;
    static double subDouble2 = 0;
    private static int addedInt11;

    int adding(int addedNum1, int addedNum2) {
        return addedNum1 + addedNum1 + addedNum2;
    }

    double adding(double addedDouble1, double addedDouble2) {
        return addedDouble1 + addedDouble2;
    }

    int substract(int subNum1, int subNum2) {
        return subNum1 - subNum2;
    }

    double substract(double subDouble1, double subDouble2) {
        return subDouble1 - subDouble2;
    }


    public static void main(String[] args) {
        HomeWorkOverloadedMethods addInt = new HomeWorkOverloadedMethods();
        HomeWorkOverloadedMethods addDouble = new HomeWorkOverloadedMethods();
        HomeWorkOverloadedMethods subInt = new HomeWorkOverloadedMethods();
        HomeWorkOverloadedMethods subDouble = new HomeWorkOverloadedMethods();

        int addedNum = addInt.adding(5, 7);
        double addedDouble = addDouble.adding(5.4, 3.3);
        int subbedInt = subInt.substract(99, 65);
        double subbedDouble = subDouble.substract(87.6, 43.17);
        addedNum += addedInt1 = 2;
        addedDouble += addedDouble1 = 2;
        subbedInt -= subNum1 = 2;
        subbedDouble -= subDouble1 = 2;


        System.out.println(addedNum + addedDouble);
        System.out.println(subbedInt - subbedDouble);


    }


}
