package ClassesAndObject;

public class EqualsPractice {
    public static void main(String[] args) {
        String a = "apple";
        String b = "apple";
        if (a == b ){
            System.out.println("these two equals");
        }else {
            System.out.println("not equal");
        }



        String s = new String("apple"); // string object

        String d = new String("apple"); // string object
        if (s==d){
            System.out.println("equals");
        }else {
            System.out.println("not equals");
        }

    }
}
